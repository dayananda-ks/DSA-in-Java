# 📘 Time Complexity and Space Complexity - Complete Beginner's Guide

> A practical guide to understanding Big O Notation, Time Complexity, and Space Complexity for Coding Interviews and Data Structures & Algorithms.

---

# Table of Contents

1. What is Big O Notation?
2. Why Do We Need Complexity Analysis?
3. Time Complexity
4. Common Time Complexities
5. Space Complexity
6. Time Complexity Rules
7. Examples
8. Interview Cheat Sheet
9. Summary

---

# What is Big O Notation?

Big O Notation is a way to describe how the performance of an algorithm changes as the input size grows.

It answers the question:

> If the input becomes larger, how much more work will the algorithm do?

Big O does **not** measure actual execution time in seconds.

Instead, it measures the **growth rate** of the algorithm.

---

## Example

```java
for(int i = 0; i < n; i++) {
    System.out.println(i);
}
```

If:

* n = 10 → 10 operations
* n = 100 → 100 operations
* n = 1000 → 1000 operations

The work grows linearly with n.

Therefore:

```text
O(n)
```

---

# Why Do We Need Complexity Analysis?

Imagine two solutions to the same problem.

### Solution 1

```java
for(int i = 0; i < n; i++) {
    // work
}
```

### Solution 2

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        // work
    }
}
```

For:

* n = 10

    * Solution 1 → 10 operations
    * Solution 2 → 100 operations

* n = 1000

    * Solution 1 → 1000 operations
    * Solution 2 → 1,000,000 operations

Both solutions work correctly, but one scales much better.

Complexity analysis helps us choose the better solution.

---

# Time Complexity

Time Complexity measures:

> How the running time of an algorithm grows as the input size grows.

---

# Common Time Complexities

## 1. O(1) — Constant Time

The number of operations does not depend on the input size.

### Example

```java
int first = arr[0];
```

Whether the array contains:

* 10 elements
* 100 elements
* 1,000,000 elements

The operation remains the same.

### Examples

```java
return arr[0];
```

```java
int sum = a + b;
```

```java
map.get(key);
```

(Average case)

### Complexity

```text
O(1)
```

---

## 2. O(log n) — Logarithmic Time

The input size is reduced by half repeatedly.

### Example

```java
while(n > 1) {
    n = n / 2;
}
```

For n = 16

```text
16
8
4
2
1
```

Only 4 iterations.

### Complexity

```text
O(log n)
```

### Common Examples

* Binary Search
* Balanced Binary Search Tree operations

---

## 3. O(n) — Linear Time

The work grows directly with the input size.

### Example

```java
for(int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Complexity

```text
O(n)
```

### Common Examples

* Linear Search
* Finding Maximum Element
* Finding Minimum Element

---

## 4. O(n log n)

A linear operation combined with a logarithmic operation.

### Example

```java
for(int i = 0; i < n; i++) {

    int x = n;

    while(x > 1) {
        x /= 2;
    }
}
```

Outer Loop:

```text
O(n)
```

Inner Loop:

```text
O(log n)
```

Total:

```text
O(n log n)
```

### Common Examples

* Merge Sort
* Heap Sort
* Quick Sort (Average Case)

---

## 5. O(n²) — Quadratic Time

Usually caused by nested loops.

### Example

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {

    }
}
```

Operations:

```text
n × n
```

### Complexity

```text
O(n²)
```

### Common Examples

* Bubble Sort
* Selection Sort
* Brute Force Two Sum

---

## 6. O(n³) — Cubic Time

Three nested loops.

### Example

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        for(int k = 0; k < n; k++) {

        }
    }
}
```

### Complexity

```text
O(n³)
```

---

## 7. O(2ⁿ) — Exponential Time

The number of operations doubles at each step.

### Example

Naive Recursive Fibonacci

```java
fib(n) = fib(n-1) + fib(n-2)
```

### Complexity

```text
O(2ⁿ)
```

Very slow for large inputs.

---

## 8. O(n!) — Factorial Time

Generates all possible arrangements.

### Example

Finding all permutations.

### Complexity

```text
O(n!)
```

This becomes impractical very quickly.

---

# Growth Comparison

| n    | O(1) | O(log n) | O(n) | O(n log n) | O(n²)     |
| ---- | ---- | -------- | ---- | ---------- | --------- |
| 10   | 1    | 3        | 10   | 30         | 100       |
| 100  | 1    | 7        | 100  | 700        | 10,000    |
| 1000 | 1    | 10       | 1000 | 10,000     | 1,000,000 |

---

# Time Complexity Rules

## Rule 1: Ignore Constants

```java
for(int i = 0; i < 2*n; i++) {}
```

Complexity:

```text
O(2n)
```

Simplified:

```text
O(n)
```

---

## Rule 2: Keep the Highest Order Term

```text
O(n² + n)
```

Becomes:

```text
O(n²)
```

---

## Rule 3: Sequential Loops Add

```java
for(int i = 0; i < n; i++) {}

for(int j = 0; j < n; j++) {}
```

Complexity:

```text
O(n + n)
```

Simplified:

```text
O(n)
```

---

## Rule 4: Nested Loops Multiply

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {}
}
```

Complexity:

```text
O(n × n)
```

Result:

```text
O(n²)
```

---

## Rule 5: Different Variables

```java
for(int i = 0; i < n; i++) {}

for(int j = 0; j < m; j++) {}
```

Complexity:

```text
O(n + m)
```

---

## Rule 6: Different Nested Variables

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < m; j++) {}
}
```

Complexity:

```text
O(nm)
```

---

# Space Complexity

Space Complexity measures:

> How much extra memory an algorithm uses.

We usually ignore the input itself and count only extra memory.

---

## O(1) Space

### Example

```java
int max = arr[0];
int count = 0;
```

Only a few variables are used.

### Complexity

```text
O(1)
```

---

## O(n) Space

### Example

```java
int[] temp = new int[n];
```

Memory grows with input size.

### Complexity

```text
O(n)
```

---

## HashMap Space Complexity

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

Worst Case:

Stores n elements.

### Complexity

```text
O(n)
```

---

## Recursive Space Complexity

```java
factorial(n)
```

Each recursive call uses stack memory.

Depth:

```text
n
```

Space Complexity:

```text
O(n)
```

---

# Example Analysis

## Example 1

```java
for(int i = 0; i < n; i++) {}
```

Time:

```text
O(n)
```

Space:

```text
O(1)
```

---

## Example 2

```java
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {}
}
```

Time:

```text
O(n²)
```

Space:

```text
O(1)
```

---

## Example 3

```java
while(n > 1) {
    n /= 2;
}
```

Time:

```text
O(log n)
```

Space:

```text
O(1)
```

---

## Example 4 (Two Sum - Brute Force)

```java
for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {

    }
}
```

Time:

```text
O(n²)
```

Space:

```text
O(1)
```

---

## Example 5 (Two Sum - HashMap)

```java
HashMap<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < n; i++) {

}
```

Time:

```text
O(n)
```

Space:

```text
O(n)
```

---

# Interview Cheat Sheet

| Pattern                | Time Complexity |
| ---------------------- | --------------- |
| Array Access           | O(1)            |
| HashMap Lookup         | O(1) Average    |
| Single Loop            | O(n)            |
| Nested Loops           | O(n²)           |
| Triple Nested Loops    | O(n³)           |
| Divide by 2 Repeatedly | O(log n)        |
| Loop + Divide by 2     | O(n log n)      |
| Binary Search          | O(log n)        |
| Merge Sort             | O(n log n)      |
| Bubble Sort            | O(n²)           |
| DFS/BFS                | O(V + E)        |

---

# Quick Method to Identify Complexity

Whenever you see code, ask:

1. How many loops are there?
2. Are loops nested?
3. Is the input being divided by 2?
4. Is recursion being used?
5. Is a HashMap or HashSet used?
6. Is extra memory growing with n?

Answering these questions usually reveals the complexity.

---

# Summary

## Time Complexity

Measures:

```text
How running time grows as input size grows.
```

## Space Complexity

Measures:

```text
How memory usage grows as input size grows.
```

## Big O Notation

Used to describe:

```text
The growth rate of an algorithm.
```

### Preferred Order (Best → Worst)

```text
O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(2ⁿ)
O(n!)
```

The goal of optimization is to move toward the top of this list whenever possible.

---


