import os
import re
import argparse
import Levenshtein
import lizard
from codebleu import calc_codebleu

# Read single file
def read_file(file_path):
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as file:
        return file.read()

def calculate_CChange(bug_dir, image_tag):
    diff_path = os.path.join(bug_dir, image_tag, image_tag+".txt")
    patch_content = read_file(diff_path)
    class_pattern = re.compile(r'^diff --git')
    c_change = sum(1 for line in patch_content.split('\n') if class_pattern.match(line))

    return c_change

def calculate_MChange(bug_dir, image_tag):
    diff_path = os.path.join(bug_dir, image_tag, image_tag+".txt")
    patch_content = read_file(diff_path)
    method_pattern = re.compile(r'^@@.*(public|protected|private|static)')
    m_change = sum(1 for line in patch_content.split('\n') if method_pattern.match(line))

    return m_change

def calculate_LChange(bug_dir, image_tag):
    diff_path = os.path.join(bug_dir, image_tag, image_tag+".txt")
    patch_content = read_file(diff_path)
    added_lines = sum(1 for line in patch_content.split('\n') if line.startswith('+') and not line.startswith('++'))
    deleted_lines = sum(1 for line in patch_content.split('\n') if line.startswith('-') and not line.startswith('--'))
    l_change = added_lines + deleted_lines

    return l_change

# Calculate total Levenshtein distance from all modified files
def calculate_LD(bug_dir, image_tag):
    base_dir = os.path.join(bug_dir, image_tag)
    buggy_dir = os.path.join(base_dir, 'Buggy-Version',image_tag+"B")
    patched_dir = os.path.join(base_dir, 'Patched-Version',image_tag+"F")

    # Output the result to a txt file in the image_tag folder
    output_file_path = os.path.join(base_dir, 'levenshtein_results.txt')
    
    total_distance = 0

    with open(output_file_path, 'w', encoding='utf-8') as output_file:
        for subdir, dirs, files in os.walk(buggy_dir):
            for file in files:
                if file.endswith('.java'):
                    buggy_file_path = os.path.join(subdir, file)
                    relative_path = os.path.relpath(buggy_file_path, buggy_dir)
                    patched_file_path = os.path.join(patched_dir, relative_path)

                    if os.path.exists(patched_file_path):
                        buggy_content = read_file(buggy_file_path)
                        patched_content = read_file(patched_file_path)
                        ld = Levenshtein.distance(buggy_content, patched_content)
                        if ld != 0:
                            output_file.write(f'Levenshtein Distance for {relative_path}: {ld}\n')
                        total_distance += ld
                    else:
                        output_file.write(f'Patched file for {relative_path} does not exist.\n')

    return total_distance

def calculate_file_complexity_total(file_path):
    """Calculate the methods' total Cyclomatic Complexity。"""
    analysis_result = lizard.analyze_file(file_path)
    total_complexity = sum(f.cyclomatic_complexity for f in analysis_result.function_list)
    return total_complexity

def calculate_CB(bug_dir, image_tag):
    """Calculate Buggy of files' total Cyclomatic complexity"""
    base_dir = os.path.join(bug_dir, image_tag)
    buggy_dir = os.path.join(base_dir, 'Buggy-Version',image_tag+"B")
    patched_dir = os.path.join(base_dir, 'Patched-Version',image_tag+"F")
    
    total_cb = 0
    for subdir, dirs, files in os.walk(buggy_dir):
        for file in files:
            if file.endswith('.java'):
                buggy_file_path = os.path.join(subdir, file)
                relative_path = os.path.relpath(buggy_file_path, buggy_dir)
                patched_file_path = os.path.join(patched_dir, relative_path)

                if os.path.exists(patched_file_path):
                    buggy_content = read_file(buggy_file_path)
                    patched_content = read_file(patched_file_path)
                    ld = Levenshtein.distance(buggy_content, patched_content)

                    if ld != 0:
                        cb = calculate_file_complexity_total(buggy_file_path)
                        total_cb += cb

    return total_cb

def calculate_CP(bug_dir, image_tag):
    """Calculate Buggy files' total Cyclomatic complexity"""
    base_dir = os.path.join(bug_dir, image_tag)
    buggy_dir = os.path.join(base_dir, 'Buggy-Version',image_tag+"B")
    patched_dir = os.path.join(base_dir, 'Patched-Version',image_tag+"F")
    total_cp = 0
    for subdir, dirs, files in os.walk(buggy_dir):
        for file in files:
            if file.endswith('.java'):
                buggy_file_path = os.path.join(subdir, file)
                relative_path = os.path.relpath(buggy_file_path, buggy_dir)
                patched_file_path = os.path.join(patched_dir, relative_path)

                if os.path.exists(patched_file_path):
                    buggy_content = read_file(buggy_file_path)
                    patched_content = read_file(patched_file_path)
                    ld = Levenshtein.distance(buggy_content, patched_content)

                    if ld != 0:
                        cp = calculate_file_complexity_total(patched_file_path)
                        total_cp += cp

    return total_cp

def calculate_CC(CB, CP):
    """Calculate CC: |CB-CP|"""
    total_cc = abs(CB - CP)
    return total_cc

def calculate_CodeBLEU(bug_dir, image_tag):
    base_dir = os.path.join(bug_dir, image_tag)
    buggy_dir = os.path.join(base_dir, 'Buggy-Version',image_tag+"B")
    patched_dir = os.path.join(base_dir, 'Patched-Version',image_tag+"F")
    output_file_path = os.path.join(base_dir, 'codebleu_results.txt')

    total_codebleu_score = 0
    score_record_count = 0

    with open(output_file_path, 'w', encoding='utf-8') as output_file:
        for subdir, dirs, files in os.walk(buggy_dir):
            for file in files:
                if file.endswith('.java'):
                    buggy_file_path = os.path.join(subdir, file)
                    relative_path = os.path.relpath(buggy_file_path, buggy_dir)
                    patched_file_path = os.path.join(patched_dir, relative_path)

                    if os.path.exists(patched_file_path):
                        buggy_content = read_file(buggy_file_path)
                        patched_content = read_file(patched_file_path)

                        result = calc_codebleu([buggy_content], [patched_content], lang="java", weights=(0.25, 0.25, 0.25, 0.25))
                        codebleu_score = result["codebleu"]
                        
                        if codebleu_score != 1.0:
                            total_codebleu_score += codebleu_score
                            score_record_count += 1
                            
                            output_file.write(f'CodeBLEU Score for {relative_path}: {codebleu_score}\n')
                            output_file.write(f'Detailed Score: {result}\n')
                    else:
                        output_file.write(f'Patched file for {relative_path} does not exist.\n')

    if score_record_count > 0:
        average_codebleu_score = total_codebleu_score / score_record_count
        print(f'Average CodeBLEU Score: {average_codebleu_score}')
    else:
        print('No valid CodeBLEU scores were recorded.')
    return average_codebleu_score

def main():
    parser = argparse.ArgumentParser(description='Calculate metrics for bug fixes.')
    parser.add_argument('bug_dataset', type=str, help='The dataset containing the bugs.')
    parser.add_argument('bug_name', type=str, help='The name of the bug.')
    parser.add_argument('metric', type=str, help='The metric to calculate.')
    args = parser.parse_args()

    if args.metric == 'CChange':
        result = calculate_CChange(args.bug_dataset, args.bug_name)
    elif args.metric == 'MChange':
        result = calculate_MChange(args.bug_dataset, args.bug_name)
    elif args.metric == 'LChange':
        result = calculate_LChange(args.bug_dataset, args.bug_name)
    elif args.metric == 'LD':
        result = calculate_LD(args.bug_dataset, args.bug_name)
    elif args.metric == 'CB':
        result = calculate_CB(args.bug_dataset, args.bug_name)
    elif args.metric == 'CP':
        result = calculate_CP(args.bug_dataset, args.bug_name)
    elif args.metric == 'CC':
        CB = calculate_CB(args.bug_dataset, args.bug_name)
        CP = calculate_CP(args.bug_dataset, args.bug_name)
        result = calculate_CC(CB, CP)
    elif args.metric == 'CodeBLEU':
        result = calculate_CodeBLEU(args.bug_dataset, args.bug_name)
    else:
        raise ValueError(f"Unknown metric: {args.metric}")

    print(f"{args.metric}: {result}")

if __name__ == "__main__":
    main()