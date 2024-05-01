import difflib
import Levenshtein
import sys
import lizard
import csv
from codebleu import calc_codebleu
import matplotlib.pyplot as plt
import numpy as np
import os
import pandas as pd

# import lizard



def open_file(f1, f2):
    with open(f1,'r') as file_1, open(f2,'r') as file_2:
        differ = difflib.Differ()
        result_list = list(differ.compare(file_1.readlines(), file_2.readlines()))
    # print(result_list)
    return result_list

def CChange(f1, f2):
    diff_list = open_file(f1,f2)
    num_CChange = 0
    num_bracket = 0
    for i in range(len(diff_list)):
        if "public class" in diff_list[i]:
            num_bracket += 1
            for j in range(i+1,len(diff_list)):
                if "{" in diff_list[j]:
                    num_bracket += 1
                if "}" in diff_list[j]:
                    num_bracket -= 1
                if num_bracket <= 0:
                    break
                if "+" in diff_list[j] or "-" in diff_list[j]:
                    num_CChange += 1
                    num_bracket = 0
                    break
    return num_CChange

def MChange(f1, f2):
    diff_list = open_file(f1,f2)
    num_MChange = 0
    num_bracket = 0
    for i in range(len(diff_list)):
        if "public static" in diff_list[i] and "{" in diff_list[i]:
            num_bracket += 1
            for j in range(i+1,len(diff_list)):
                if "{" in diff_list[j]:
                    num_bracket += 1
                if "}" in diff_list[j]:
                    num_bracket -= 1
                if num_bracket <= 0:
                    break
                if "+" in diff_list[j] or "-" in diff_list[j]:
                    num_MChange += 1
                    num_bracket = 0
                    break
    return num_MChange

def LChange(f1, f2):
    diff_list = open_file(f1,f2)
    num_LChange = 0
    for i in range(len(diff_list)):
        if diff_list[i].startswith("-"):
            if diff_list[i] != ("- \n"):
                num_LChange += 1
        if diff_list[i].startswith("+"):
            if diff_list[i] != ("+ \n"):
                num_LChange += 1
    return int(num_LChange)

# def CB(f1, f2):


def LD(f1, f2):
    # with open(f1,'r') as file_1, open(f2,'r') as file_2:
    #     f1_content = file_1.readlines()
    #     f2_content = file_2.readlines()
    # print(f2_content)
    infile1 = open(f1, 'r')
    data1 = infile1.read()
    # print(data1)
    
    infile2 = open(f2, 'r')
    data2 = infile2.read()
    # print(data2)
    num_LD = Levenshtein.distance(data1,data2)
    infile1.close()
    infile2.close()
    return num_LD

def CB(f):
    i = lizard.analyze_file(f)
    num_CB = i.function_list[0].cyclomatic_complexity
        
    return num_CB

def CP(f):
    i = lizard.analyze_file(f)
    num_CP = i.function_list[0].cyclomatic_complexity
        
    return num_CP

def CC(f1, f2):
    num_CB = CB(f1)
    num_CP = CP(f2)
    num_CC = abs(num_CB-num_CP)
    return num_CC

def CodeBLEU(f1, f2):
    with open(f1,'r') as file_1, open(f2,'r') as file_2:
        f1_content = file_1.readlines()
        f2_content = file_2.readlines()
    f1_content = " ".join(f1_content)
    f2_content = " ".join(f2_content)
    # print(f1_content)
    # print(f2_content)
    prediction = f1_content
    reference = f2_content

    result = calc_codebleu([reference], [prediction], lang="java", weights=(0.25, 0.25, 0.25, 0.25), tokenizer=None)
    # print(result)
    return result['codebleu']

if __name__ == "__main__":
    bug_dataset = sys.argv[1]
    bug_name = sys.argv[2]
    metric = sys.argv[3]

    buggy_file = bug_name+"/Buggy-Version/java_programs/"+bug_name+".java"
    patched_file = bug_name+"/Patched-Version/correct_java_programs/"+bug_name+".java"


    class_names = ["BITCOUNT","BREADTH_FIRST_SEARCH","FIND_FIRST_IN_SORTED","FIND_IN_SORTED","GCD",
                   "GET_FACTORS","LEVENSHTEIN","LIS","LONGEST_COMMON_SUBSEQUENCE","MINIMUM_SPANNING_TREE",
                   "NEXT_PALINDROME","NEXT_PERMUTATION","PASCAL","POSSIBLE_CHANGE","POWERSET",
                   "QUICKSORT","REVERSE_LINKED_LIST","WRAP","SIEVE","SQRT"]
    if bug_name not in class_names:
        print("Invalid bug name")
        sys.exit()

    if metric == "CChange":
        num_CChange = CChange(buggy_file,patched_file)
        print("CChange is: ",str(num_CChange))
    elif metric == "MChange":
        num_MChange = MChange(buggy_file,patched_file)
        print("MChange is: ",str(num_MChange))
    elif metric == "LChange":
        num_LC = LChange(buggy_file,patched_file)
        print("LChange is: ",str(num_LC))
    elif metric == "LD":
        num_LD = LD(buggy_file,patched_file)
        print("LD is: ",str(num_LD))
    elif metric == "CB":
        num_CB = CB(buggy_file)
        print("CB is: ",str(num_CB))
    elif metric == "CP":
        num_CP = CP(patched_file)
        print("CP is: ",str(num_CP))
    elif metric == "CC":
        num_CC = CC(buggy_file,patched_file)
        print("CC is: ",str(num_CC))
    elif metric == "CodeBLEU":
        num_CodeBLEU = CodeBLEU(buggy_file,patched_file)
        print("CodeBLEU is: ",str(num_CodeBLEU))
    else:
        print("Invalid metric name")

    # class_names = ["BITCOUNT","BREADTH_FIRST_SEARCH","FIND_FIRST_IN_SORTED","FIND_IN_SORTED","GCD",
    #                "GET_FACTORS","LEVENSHTEIN","LIS","LONGEST_COMMON_SUBSEQUENCE","MINIMUM_SPANNING_TREE",
    #                "NEXT_PALINDROME","NEXT_PERMUTATION","PASCAL","POSSIBLE_CHANGE","POWERSET",
    #                "QUICKSORT","REVERSE_LINKED_LIST","WRAP","SIEVE","SQRT"]
    # metric_names = ["bug_name","CChange","MChange", "LChange","LD","CB","CP","CC","CodeBLEU"]
    # with open('results/metrics.csv', 'w', newline='') as file:
    #     writer = csv.writer(file)
    #     writer.writerow(metric_names)
    #     for c in class_names:
    #         buggy_file = c+"/Buggy-Version/java_programs/"+c+".java"
    #         patched_file = c+"/Patched-Version/correct_java_programs/"+c+".java"
    #         num_CChange = CChange(buggy_file,patched_file)
    #         num_MChange = MChange(buggy_file,patched_file)
    #         num_LChange = LChange(buggy_file,patched_file)
    #         num_LD = LD(buggy_file,patched_file)
    #         num_CB = CB(buggy_file)
    #         num_CP = CP(patched_file)
    #         num_CC = CC(buggy_file,patched_file)
    #         num_CodeBLEU = CodeBLEU(buggy_file,patched_file)
            
    #         writer.writerow([c,num_CChange,num_MChange,num_LChange,num_LD,num_CB,num_CP,num_CC,num_CodeBLEU])


        # # read csv file:
        # data = pd.read_csv('results/result.csv')

        # # get column names
        # metric_names = data.columns
        # # print("metric name: ",metric_names)
        # # plot graph for each metrix
        # for metric in metric_names:
        #     if metric == "bug_name":
        #         continue
        #     # print(data[metric].values)
        #     plt.figure(figsize=(8, 6))
        #     plt.boxplot(data[metric].values)
        #     plt.title('Box Chart of {}'.format(metric))
        #     plt.xlabel('{}'.format(metric))
        #     plt.ylabel('Values')
        #     plt.grid(True)
        #     plt.savefig(os.path.join("results", '{}.png'.format(metric)))
        #     plt.close()
    
        