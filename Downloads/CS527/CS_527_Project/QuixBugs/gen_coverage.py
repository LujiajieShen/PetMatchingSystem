import os
import subprocess

# Directory containing the projects
PROJECT_DIR = "/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs"


def coverage():
    code_path = "correct_java_programs."
    # Loop through each project folder
    for project_name in os.listdir(PROJECT_DIR):
        project_folder = os.path.join(PROJECT_DIR, project_name)
        if os.path.isdir(project_folder):
            # Determine the path to the Java program within the project folder
            java_program_path = os.path.join(project_folder, "Buggy-Version")
            if os.path.exists(java_program_path):
                
                os.chdir(java_program_path)
                
                subprocess.run(
                ["gradle", "build"]
                )
                subprocess.run(
                ["gradle", "generateJacocoHtmlReport"]
                )
            else:
                print(f"java_programs folder not found in project {project_name}.")

if __name__ == "__main__":
    coverage()