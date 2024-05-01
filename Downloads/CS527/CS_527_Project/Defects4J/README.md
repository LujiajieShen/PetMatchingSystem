## Contents of Dataset and the Method of Collection
Defects4J is a curated collection of reproducible bugs from real-world Java projects. The dataset aims to provide a standardized testbed for evaluating software engineering research tools, such as fault localization, program repair, and automatic test generation methods. Defects4J contains bugs from several open-source projects, including JFreeChart, Apache Commons Lang, Apache Commons Math, Joda-Time, and more.

The dataset is constructed by identifying bugs that are fixed in a single commit within the project's version control system. Each bug in the dataset is minimized to remove unrelated changes that were part of the bug-fixing commit. This minimization process ensures that each bug is associated with a precise root cause and a triggering test case that fails on the buggy version but passes on the fixed version. Bugs are identified through a careful manual process, utilizing commit messages, issue tracker entries, and the analysis of commit diffs.

## Number of Bugs
Defects4J version 2.0.1, as an example, contains the following statistics:

A total of 835 bugs across various projects, with an additional 29 deprecated bugs that are no longer reproducible or relevant under Java 8.


## The Number of Tests Per Bug
Each bug in Defects4J is associated with at least one failing test case that directly exposes the bug. The exact number of tests per bug varies depending on the complexity of the bug and the coverage of the test suite in the original project. On average, there are multiple test cases per bug, including both failing tests that expose the bug and passing tests that ensure unaffected functionality remains correct.

## Five Samples
Five examples are shown in the Five_Samples folder. The file is named in this convetion <project_name>_<bug_id>_diff_output.txt