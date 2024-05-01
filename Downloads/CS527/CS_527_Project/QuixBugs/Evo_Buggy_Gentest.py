import os
import subprocess

# Path to the Randoop JAR file
EVOSUITE_JAR = "/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/evosuite-1.0.6.jar"

# Directory containing the projects
PROJECT_DIR = "/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs"

# Function to generate tests for a Java program
def generate_tests(project_name, java_program_path, class_name,output_folder):
    # output_folder = f"./generated_tests/{project_name}/{class_name}"
    os.makedirs(output_folder, exist_ok=True)
    print(f"Generating tests for {class_name} in project {project_name}...")
    try:
        subprocess.run(
            ["java", "-classpath", f"{java_program_path}:{EVOSUITE_JAR}", "org.evosuite.EvoSuite","-class=java_programs." + project_name,
             "-projectCP=" + java_program_path,  "-Dtest_dir=" + output_folder],
            timeout=1000)  # Set the timeout value (in seconds)
        print(f"Tests generated for {class_name} in project {project_name}.")
    except subprocess.TimeoutExpired:
        print(f"Test generation for {class_name} in project {project_name} timed out.")
        
#         java -jar $EVOSUITE_JAR_PATH\
#     -class=$TEST_CLASS \
#     -projectCP=$PROJECT_CLASSPATH \
#     -Dtest_dir=$EVOSUITE_TEST_DIR
def buggy_version():
    code_path = "correct_java_programs."
    # Loop through each project folder
    for project_name in os.listdir(PROJECT_DIR):
        project_folder = os.path.join(PROJECT_DIR, project_name)
        if os.path.isdir(project_folder):
            # Determine the path to the Java program within the project folder
            java_program_path = os.path.join(project_folder, "Buggy-Version")
            java_program_path1 = os.path.join(project_folder, "Buggy-Version/build/classes/java/main")
            output_folder = os.path.join(java_program_path, "java_testcases/junit")
            if os.path.exists(java_program_path):
                
                os.chdir(java_program_path)
                
                subprocess.run(
                ["gradle", "build"]
                )
                generate_tests(project_name, java_program_path1, project_name,output_folder)
            else:
                print(f"java_programs folder not found in project {project_name}.")

if __name__ == "__main__":
    # bugg_version()
    buggy_version()
    # java -classpath /Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/GCD/Buggy-Version/build/classes/java/main:
    # /Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/evosuite-1.0.6.jar 
    # org.evosuite.EvoSuite -class java_programs.GCD -projectCP /Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/GCD/Buggy-Version/build/classes/java/main
