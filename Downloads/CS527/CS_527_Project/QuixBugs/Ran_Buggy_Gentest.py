import os
import subprocess

# Path to the Randoop JAR file
RANDOOP_JAR = "/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/randoop-all-4.3.2.jar"

# Directory containing the projects
PROJECT_DIR = "/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs"

# Function to generate tests for a Java program
def generate_tests(project_name, java_program_path, class_name,output_folder,code_path):
    # output_folder = f"./generated_tests/{project_name}/{class_name}"
    os.makedirs(output_folder, exist_ok=True)
    print(f"Generating tests for {class_name} in project {project_name}...")
    try:
        subprocess.run(
            ["java", "-classpath", f"{java_program_path}:{RANDOOP_JAR}", "randoop.main.Main", "gentests",
             "--testclass=" + code_path + class_name, "--time-limit=100","--regression-test-basename=RandoopRegressionTest","--junit-output-dir=" + output_folder],
            timeout=1000)  # Set the timeout value (in seconds)
        print(f"Tests generated for {class_name} in project {project_name}.")
    except subprocess.TimeoutExpired:
        print(f"Test generation for {class_name} in project {project_name} timed out.")

def bugg_version():
    # Loop through each project folder
    code_path = "java_programs."
    for project_name in os.listdir(PROJECT_DIR):
        # if project_name == "FIND_IN_SORTED":
        # print(project_name)
        project_folder = os.path.join(PROJECT_DIR, project_name)
        if os.path.isdir(project_folder):
            # Determine the path to the Java program within the project folder
            java_program_path = os.path.join(project_folder, "Buggy-Version")
            output_folder = os.path.join(java_program_path, "java_testcases/junit")
            if os.path.exists(java_program_path):
                generate_tests(project_name, java_program_path, project_name,output_folder,code_path)
            else:
                print(f"java_programs folder not found in project {project_name}.")

def patched_version():
    code_path = "correct_java_programs."
    # Loop through each project folder
    for project_name in os.listdir(PROJECT_DIR):
        project_folder = os.path.join(PROJECT_DIR, project_name)
        if os.path.isdir(project_folder):
            # Determine the path to the Java program within the project folder
            java_program_path = os.path.join(project_folder, "Patched-Version")
            output_folder = os.path.join(java_program_path, "java_testcases/junit/crt_program")
            if os.path.exists(java_program_path):
                generate_tests(project_name, java_program_path, project_name,output_folder,code_path)
            else:
                print(f"java_programs folder not found in project {project_name}.")

if __name__ == "__main__":
    bugg_version()
    # patched_version()