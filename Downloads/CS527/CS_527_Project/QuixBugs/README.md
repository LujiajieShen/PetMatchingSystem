## Usage
To use the Script.py to compute the metrics for QuixBugs, first navigate to CS527-Team13/QuixBugs folder
```To run script
python3 Script.py QuixBugs <class_name> <metric>
```

## Explanation & Collection of the dataset
QuixBugs dataset consists of 40 programs in two different languages: Java and Python. Those programs are classic algorithms and each with a single line of bug. Those buggy programs are created by people who are not familiar with program repair, and they are used as challenges for people who are interested in solving them as fast as possible. The dataset is collected from the Quixey challenge, in which programmers were given a short buggy program and they needed to fix it within 1 minute. It is an excellent dataset for program repair, and the programs are manually translated from Python programs to Java.
## Number of bugs in the dataset
There are 40 bugs collected in the dataset in Java.<br />
There are 40 bugs collected in the dataset in Python.
## Number of tests per bug (tests that fail on buggy and pass on fixed)
- bitcount: 9
- breadth\_first\_search: 1
- bucketsort: 6
- depth\_first\_search: 1
- detect\_cycle: 1
- find\_first\_in\_sorted: 3
- find\_in\_sorted: 2
- flatten: 6
- gcd: 5
- get\_factors: 10
- hanoi: 7
- is\_valid\_parenthesization: 1
- kheapsort: 3
- knapsack: 6
- kth: 4
- lcs\_length: 8
- levenshtein: 5 failed, 1 skipped
- lis: 4
- longest\_common\_subsequence: 4
- max\_sublist\_sum: 4
- mergesort: 13
- minimum\_spanning\_tree: 2(Java), 3(Python)
- next\_palindrome: 1
- next\_permutation: 8
- pascal: 4
- possible\_change: 9
- powerset: 4
- quicksort: 1
- reverse\_linked\_list: 2
- rpn\_eval: 3
- shortest\_path\_length: 2
- shortest\_path\_lengths: 4
- shortest\_paths: 3
- shunting\_yard: 4
- sieve: 5
- sqrt: 6
- subsequences: 10
- to\_base: 7
- topological\_ordering: 3
- wrap: 5
## Java Examples of buggy and fixed code
1. buggy GCD.java
```
package java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(a % b, b);
        }
    }
}
   ```
fixed GCD.java
```
package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
}

```
Difference: 
```
Binary files buggy/.DS_Store and fixed/.DS_Store differ
diff -uNr buggy/GCD.java fixed/GCD.java
--- buggy/GCD.java	2024-02-05 18:12:59.000000000 -0600
+++ fixed/GCD.java	2024-02-05 18:12:59.000000000 -0600
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -16,7 +16,7 @@
         if (b == 0) {
             return a;
         } else {
-            return gcd(a % b, b);
+            return gcd(b, a%b);
         }
     }
 }

```
The buggy code uses ``` return gcd(a % b, b); ```
while the fixed code uses ``` return gcd(b, a%b); ```

2. buggy KTH.java
```
package java_programs;
import java.util.*;
/*

 */
public class KTH {
    public static Integer kth(ArrayList<Integer> arr, int k) {
        int pivot = arr.get(0);
        ArrayList<Integer> below, above;
        below = new ArrayList<Integer>(arr.size());
        above = new ArrayList<Integer>(arr.size());
        for (Integer x : arr) {
            if (x < pivot) {
                below.add(x);
            } else if (x > pivot) {
                above.add(x);
            }
        }

        int num_less = below.size();
        int num_lessoreq = arr.size() - above.size();
        if (k < num_less) {
            return kth(below, k);
        } else if (k >= num_lessoreq) {
            return kth(above, k);
        } else {
            return pivot;
        }
    }
}
```
fixed KTH.java
```
package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class KTH {
    public static Integer kth(ArrayList<Integer> arr, int k) {
        int pivot = arr.get(0);
        ArrayList<Integer> below, above;
        below = new ArrayList<Integer>(arr.size());
        above = new ArrayList<Integer>(arr.size());
        for (Integer x : arr) {
            if (x < pivot) {
                below.add(x);
            } else if (x > pivot) {
                above.add(x);
            }
        }

        int num_less = below.size();
        int num_lessoreq = arr.size() - above.size();
        if (k < num_less) {
            return kth(below, k);
        } else if (k >= num_lessoreq) {
            return kth(above, k-num_lessoreq);
        } else {
            return pivot;
        }
    }
}
```
Difference:
```
Binary files buggy/.DS_Store and fixed/.DS_Store differ
diff -uNr buggy/KTH.java fixed/KTH.java
--- buggy/KTH.java	2024-02-05 18:12:59.000000000 -0600
+++ fixed/KTH.java	2024-02-05 18:12:59.000000000 -0600
@@ -1,7 +1,14 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
+
 /*
+ * To change this template, choose Tools | Templates
+ * and open the template in the editor.
+ */
 
+/**
+ *
+ * @author derricklin
  */
 public class KTH {
     public static Integer kth(ArrayList<Integer> arr, int k) {
@@ -22,7 +29,7 @@
         if (k < num_less) {
             return kth(below, k);
         } else if (k >= num_lessoreq) {
-            return kth(above, k);
+            return kth(above, k-num_lessoreq);
         } else {
             return pivot;
         }

```
The buggy code uses ``` return kth(above, k); ```
while the fixed code uses ``` return kth(above, k-num_lessoreq); ```

3. buggy PASCAL.java
```
package java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class PASCAL {
    public static ArrayList<ArrayList<Integer>> pascal(int n) {
        ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> init = new ArrayList<Integer>();
        init.add(1);
        rows.add(init);

        for (int r=1; r<n; r++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int c=0; c<r; c++) {
                int upleft, upright;
                if (c > 0) {
                    upleft = rows.get(r-1).get(c-1);
                } else {
                    upleft = 0;
                }
                if (c < r) {
                    upright = rows.get(r-1).get(c);
                } else {
                    upright = 0;
                }
                row.add(upleft+upright);
            }
            rows.add(row);
        }

        return rows;
    }
}
```
fixed PASCAL.java
```
package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class PASCAL {
    public static ArrayList<ArrayList<Integer>> pascal(int n) {
        ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> init = new ArrayList<Integer>();
        init.add(1);
        rows.add(init);

        for (int r=1; r<n; r++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int c=0; c<r+1; c++) {
                int upleft, upright;
                if (c > 0) {
                    upleft = rows.get(r-1).get(c-1);
                } else {
                    upleft = 0;
                }
                if (c < r) {
                    upright = rows.get(r-1).get(c);
                } else {
                    upright = 0;
                }
                row.add(upleft+upright);
            }
            rows.add(row);
        }

        return rows;
    }
}
```
Difference:
```
Binary files buggy/.DS_Store and fixed/.DS_Store differ
diff -uNr buggy/PASCAL.java fixed/PASCAL.java
--- buggy/PASCAL.java	2024-02-05 18:12:59.000000000 -0600
+++ fixed/PASCAL.java	2024-02-05 18:12:59.000000000 -0600
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -19,7 +19,7 @@
 
         for (int r=1; r<n; r++) {
             ArrayList<Integer> row = new ArrayList<Integer>();
-            for (int c=0; c<r; c++) {
+            for (int c=0; c<r+1; c++) {
                 int upleft, upright;
                 if (c > 0) {
                     upleft = rows.get(r-1).get(c-1);

```
The buggy code uses ``` for (int c=0; c<r; c++) { ```
while the fixed code uses ``` for (int c=0; c<r+1; c++) { ```

4. buggy SQRT.java
```
package java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class SQRT {
    public static double sqrt(double x, double epsilon) {
        double approx = x / 2d;
        while (Math.abs(x-approx) > epsilon) {
            approx = 0.5d * (approx + x / approx);
        }
        return approx;
    }
}
```
fixed SQRT.java
```
package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class SQRT {
    public static double sqrt(double x, double epsilon) {
        double approx = x / 2d;
        while (Math.abs(x-approx*approx) > epsilon) {
            approx = 0.5d * (approx + x / approx);
        }
        return approx;
    }
}
```
Difference:
```
Binary files buggy/.DS_Store and fixed/.DS_Store differ
diff -uNr buggy/SQRT.java fixed/SQRT.java
--- buggy/SQRT.java	2024-02-05 18:12:59.000000000 -0600
+++ fixed/SQRT.java	2024-02-05 18:12:59.000000000 -0600
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -13,7 +13,7 @@
 public class SQRT {
     public static double sqrt(double x, double epsilon) {
         double approx = x / 2d;
-        while (Math.abs(x-approx) > epsilon) {
+        while (Math.abs(x-approx*approx) > epsilon) {
             approx = 0.5d * (approx + x / approx);
         }
         return approx;

```
The buggy code uses ``` while (Math.abs(x-approx) > epsilon) { ```
while the fixed code uses ``` while (Math.abs(x-approx*approx) > epsilon) { ```

5. buggy TO_BASE.java
```
package java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class TO_BASE {
    public static String to_base(int num, int b) {
        String result = "";
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i;
        while (num > 0) {
            i = num % b;
            num = num / b; // floor division?
            result = result + String.valueOf(alphabet.charAt(i));
        }

        return result;
    }
}
```
fixed TO_BASE.java
```
package correct_java_programs;
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author derricklin
 */
public class TO_BASE {
    public static String to_base(int num, int b) {
        String result = "";
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i;
        while (num > 0) {
            i = num % b;
            num = num / b; // floor division?
            result = String.valueOf(alphabet.charAt(i))+result;
        }

        return result;
    }
}
```
Difference:
```
Binary files buggy/.DS_Store and fixed/.DS_Store differ
diff -uNr buggy/TO_BASE.java fixed/TO_BASE.java
--- buggy/TO_BASE.java	2024-02-05 18:12:59.000000000 -0600
+++ fixed/TO_BASE.java	2024-02-05 18:12:59.000000000 -0600
@@ -1,4 +1,4 @@
-package java_programs;
+package correct_java_programs;
 import java.util.*;
 
 /*
@@ -18,7 +18,7 @@
         while (num > 0) {
             i = num % b;
             num = num / b; // floor division?
-            result = result + String.valueOf(alphabet.charAt(i));
+            result = String.valueOf(alphabet.charAt(i))+result;
         }
 
         return result;

```
The buggy code uses ``` result = result + String.valueOf(alphabet.charAt(i)); ```
while the fixed code uses ``` result = String.valueOf(alphabet.charAt(i))+result; ```

## Python Examples of buggy and fixed code
1. buggy GCD.py
```
def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(a % b, b)


"""
Input:
    a: A nonnegative int
    b: A nonnegative int


Greatest Common Divisor

Precondition:
    isinstance(a, int) and isinstance(b, int)

Output:
    The greatest int that divides evenly into a and b

Example:
    >>> gcd(35, 21)
    7

"""
```
fixed GCD.py
```
def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

```
Difference: 
```
diff -uNr buggy/gcd.py fixed/gcd.py
--- buggy/gcd.py	2024-02-05 18:12:59.000000000 -0600
+++ fixed/gcd.py	2024-02-05 18:12:59.000000000 -0600
@@ -1,26 +1,7 @@
+
 def gcd(a, b):
     if b == 0:
         return a
     else:
-        return gcd(a % b, b)
-
-
-"""
-Input:
-    a: A nonnegative int
-    b: A nonnegative int
-
-
-Greatest Common Divisor
-
-Precondition:
-    isinstance(a, int) and isinstance(b, int)
-
-Output:
-    The greatest int that divides evenly into a and b
-
-Example:
-    >>> gcd(35, 21)
-    7
+        return gcd(b, a % b)
 
-"""
```
The buggy code uses ``` return gcd(a % b, b) ```
while the fixed code uses ``` return gcd(b, a % b) ```. <br>
The buggy code has explanation for the code while the fixed code doesn't.

2. buggy KTH.py
```
def kth(arr, k):
    pivot = arr[0]
    below = [x for x in arr if x < pivot]
    above = [x for x in arr if x > pivot]

    num_less = len(below)
    num_lessoreq = len(arr) - len(above)

    if k < num_less:
        return kth(below, k)
    elif k >= num_lessoreq:
        return kth(above, k)
    else:
        return pivot



"""
QuickSelect

This is an efficient equivalent to sorted(arr)[k].

Input:
    arr: A list of ints
    k: An int

Precondition:
    0 <= k < len(arr)

Output:
    The kth-lowest element of arr (0-based)
"""

```
fixed KTH.py
```

def kth(arr, k):
    pivot = arr[0]
    below = [x for x in arr if x < pivot]
    above = [x for x in arr if x > pivot]

    num_less = len(below)
    num_lessoreq = len(arr) - len(above)

    if k < num_less:
        return kth(below, k)
    elif k >= num_lessoreq:
        return kth(above, k - num_lessoreq)
    else:
        return pivot

```
Difference:
```
diff -uNr buggy/kth.py fixed/kth.py
--- buggy/kth.py	2024-02-05 18:12:59.000000000 -0600
+++ fixed/kth.py	2024-02-05 18:12:59.000000000 -0600
@@ -1,3 +1,4 @@
+
 def kth(arr, k):
     pivot = arr[0]
     below = [x for x in arr if x < pivot]
@@ -9,24 +10,6 @@
     if k < num_less:
         return kth(below, k)
     elif k >= num_lessoreq:
-        return kth(above, k)
+        return kth(above, k - num_lessoreq)
     else:
         return pivot
-
-
-
-"""
-QuickSelect
-
-This is an efficient equivalent to sorted(arr)[k].
-
-Input:
-    arr: A list of ints
-    k: An int
-
-Precondition:
-    0 <= k < len(arr)
-
-Output:
-    The kth-lowest element of arr (0-based)
-"""
```
The buggy code uses ``` return kth(above, k) ```
while the fixed code uses ``` return kth(above, k - num_lessoreq) ```. <br>
The buggy code has explanation for the code while the fixed code doesn't.

3. buggy PASCAL.py
```

def pascal(n):
    rows = [[1]]
    for r in range(1, n):
        row = []
        for c in range(0, r):
            upleft = rows[r - 1][c - 1] if c > 0 else 0
            upright = rows[r - 1][c] if c < r else 0
            row.append(upleft + upright)
        rows.append(row)

    return rows


"""
Pascal's Triangle
pascal



Input:
    n: The number of rows to return

Precondition:
    n >= 1

Output:
    The first n rows of Pascal's triangle as a list of n lists

Example:
    >>> pascal(5)
    [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
"""
```
fixed PASCAL.py
```
def pascal(n):
    rows = [[1]]
    for r in range(1, n):
        row = []
        for c in range(0, r + 1):
            upleft = rows[r - 1][c - 1] if c > 0 else 0
            upright = rows[r - 1][c] if c < r else 0
            row.append(upleft + upright)
        rows.append(row)

    return rows
```
Difference:
```
diff -uNr buggy/pascal.py fixed/pascal.py
--- buggy/pascal.py	2024-02-05 18:12:59.000000000 -0600
+++ fixed/pascal.py	2024-02-05 18:12:59.000000000 -0600
@@ -3,7 +3,7 @@
     rows = [[1]]
     for r in range(1, n):
         row = []
-        for c in range(0, r):
+        for c in range(0, r + 1):
             upleft = rows[r - 1][c - 1] if c > 0 else 0
             upright = rows[r - 1][c] if c < r else 0
             row.append(upleft + upright)
@@ -11,23 +11,3 @@
 
     return rows
 
-
-"""
-Pascal's Triangle
-pascal
-
-
-
-Input:
-    n: The number of rows to return
-
-Precondition:
-    n >= 1
-
-Output:
-    The first n rows of Pascal's triangle as a list of n lists
-
-Example:
-    >>> pascal(5)
-    [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
-"""
```
The buggy code uses ``` for c in range(0, r): ```
while the fixed code uses ``` for c in range(0, r + 1): ```. <br>
The buggy code has explanation for the code while the fixed code doesn't.


4. buggy SQRT.py
```

def sqrt(x, epsilon):
    approx = x / 2
    while abs(x - approx) > epsilon:
        approx = 0.5 * (approx + x / approx)
    return approx

"""
Square Root

Newton-Raphson method implementation.


Input:
    x: A float
    epsilon: A float

Precondition:
    x >= 1 and epsilon > 0

Output:
    A float in the interval [sqrt(x) - epsilon, sqrt(x) + epsilon]

Example:
    >>> sqrt(2, 0.01)
    1.4166666666666665
"""
```
fixed SQRT.py
```

def sqrt(x, epsilon):
    approx = x / 2
    while abs(x - approx ** 2) > epsilon:
        approx = 0.5 * (approx + x / approx)
    return approx
```
Difference:
```
diff -uNr buggy/sqrt.py fixed/sqrt.py
--- buggy/sqrt.py	2024-02-05 18:12:59.000000000 -0600
+++ fixed/sqrt.py	2024-02-05 18:12:59.000000000 -0600
@@ -1,27 +1,14 @@
 
 def sqrt(x, epsilon):
     approx = x / 2
-    while abs(x - approx) > epsilon:
+    while abs(x - approx ** 2) > epsilon:
         approx = 0.5 * (approx + x / approx)
     return approx
 
 """
-Square Root
-
-Newton-Raphson method implementation.
-
-
-Input:
-    x: A float
-    epsilon: A float
-
-Precondition:
-    x >= 1 and epsilon > 0
-
-Output:
-    A float in the interval [sqrt(x) - epsilon, sqrt(x) + epsilon]
-
-Example:
-    >>> sqrt(2, 0.01)
-    1.4166666666666665
 """
```
The buggy code uses ``` while abs(x - approx) > epsilon: ```
while the fixed code uses ``` while abs(x - approx ** 2) > epsilon: ```. <br>
The buggy code has explanation for the code while the fixed code doesn't.


5. buggy TO_BASE.py
```

import string
def to_base(num, b):
    result = ''
    alphabet = string.digits + string.ascii_uppercase
    while num > 0:
        i = num % b
        num = num // b
        result = result + alphabet[i]
    return result



"""
Integer Base Conversion
base-conversion


Input:
    num: A base-10 integer to convert.
    b: The target base to convert it to.

Precondition:
    num > 0, 2 <= b <= 36.

Output:
    A string representing the value of num in base b.

Example:
    >>> to_base(31, 16)
    '1F'
"""
```
fixed TO_BASE.py
```
import string
def to_base(num, b):
    result = ''
    alphabet = string.digits + string.ascii_uppercase
    while num > 0:
        i = num % b
        num = num // b
        result = alphabet[i] + result
    return result
```
Difference:
```
diff -uNr buggy/to_base.py fixed/to_base.py
--- buggy/to_base.py	2024-02-05 18:12:59.000000000 -0600
+++ fixed/to_base.py	2024-02-05 18:12:59.000000000 -0600
@@ -6,27 +6,17 @@
     while num > 0:
         i = num % b
         num = num // b
-        result = result + alphabet[i]
+        result = alphabet[i] + result
     return result
 
-
-
 """
-Integer Base Conversion
-base-conversion
-
-
-Input:
-    num: A base-10 integer to convert.
-    b: The target base to convert it to.
-
-Precondition:
-    num > 0, 2 <= b <= 36.
-
-Output:
-    A string representing the value of num in base b.
-
-Example:
-    >>> to_base(31, 16)
-    '1F'
```
The buggy code uses ``` result = result + alphabet[i] ```
while the fixed code uses ``` result = alphabet[i] + result ```. <br>
The buggy code has explanation for the code while the fixed code doesn't.

