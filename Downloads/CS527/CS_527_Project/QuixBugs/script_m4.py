import matplotlib.pyplot as plt
import pandas as pd
from scipy.stats import linregress, pearsonr

metrics_data = pd.read_csv('/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/results/metrics.csv')
results_data = pd.read_csv('/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/results/m4_result.csv')

merged_data = pd.merge(metrics_data, results_data, on='Bug_ID')

def plot_with_regression(x, y, xlabel, ylabel, title, file_path):
    plt.figure(figsize=(8, 6))
    plt.scatter(x, y, color='blue', marker='o')
    slope, intercept, r_value, p_value, std_err = linregress(x, y)
    plt.plot(x, intercept + slope * x, 'r', label=f'y={slope:.2f}x+{intercept:.2f}\nr={r_value:.2f}')
    plt.title(title)
    plt.xlabel(xlabel)
    plt.ylabel(ylabel)
    plt.legend()
    plt.grid(True)
    plt.savefig(file_path)
    plt.show()
    return r_value

def rank_correlation(x, y):
    corr, _ = pearsonr(x.rank(), y.rank())
    return corr

r_ld_ar = plot_with_regression(merged_data['LD'], merged_data['AR'], 'LD', 'AR', 'LD vs AR with Regression Line', '/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/results/LD_vs_AR.png')
r_ld_fr = plot_with_regression(merged_data['LD'], merged_data['FR'], 'LD', 'FR', 'LD vs FR with Regression Line', '/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/results/LD_vs_FR.png')
r_codebleu_ar = plot_with_regression(merged_data['CodeBLEU'], merged_data['AR'], 'CodeBLEU', 'AR', 'CodeBLEU vs AR with Regression Line', '/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/results/CodeBLEU_vs_AR.png')
r_codebleu_fr = plot_with_regression(merged_data['CodeBLEU'], merged_data['FR'], 'CodeBLEU', 'FR', 'CodeBLEU vs FR with Regression Line', '/Users/eeeeeeshen/Downloads/CS527/CS_527_Project/QuixBugs/results/CodeBLEU_vs_FR.png')

print(f"Rank Correlation LD-AR: {rank_correlation(merged_data['LD'], merged_data['AR'])}")
print(f"Rank Correlation LD-FR: {rank_correlation(merged_data['LD'], merged_data['FR'])}")
print(f"Rank Correlation CodeBLEU-AR: {rank_correlation(merged_data['CodeBLEU'], merged_data['AR'])}")
print(f"Rank Correlation CodeBLEU-FR: {rank_correlation(merged_data['CodeBLEU'], merged_data['FR'])}")
