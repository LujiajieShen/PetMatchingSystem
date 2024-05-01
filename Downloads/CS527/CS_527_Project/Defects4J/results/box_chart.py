import pandas as pd
import matplotlib.pyplot as plt

# Read the CSV file skipping the first row
df = pd.read_csv('randoop without fail test codeBleu.csv', header=0)

# Generate box plot
df.boxplot(figsize=(10, 6))
plt.title('CodeBLEU metric without Randoop failing test')
plt.ylabel('CodeBLEU metric')
plt.xlabel('Defects4J dataset')
plt.xticks(rotation=45, ha='right')
plt.tight_layout()
plt.show()