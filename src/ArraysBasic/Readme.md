# Arrays Basics in Java

A beginner-friendly collection of 25 fundamental array problems implemented in Java. This package is part of my Data Structures and Algorithms (DSA) learning journey, where I solve problems from basic to advanced levels and document the algorithmic techniques, time complexity, and space complexity for each problem.

---

## 📌 Project Overview

The `ArraysBasics` package covers essential array problems that help build a strong foundation in:

* Array traversal
* Linear scanning
* Two pointers
* Hashing
* Prefix sums
* Sliding concepts
* Problem-solving patterns

Each problem includes:

* ✅ Problem definition
* ✅ Algorithmic technique used
* ✅ Time complexity
* ✅ Space complexity
* ✅ Java implementation

---

## 📁 Folder Structure

```text
ArraysBasics/
├── README.md
├── MaxNum.java
├── MinNum.java
├── ReverseArray.java
├── SumArray.java
├── AverageArray.java
├── LinearSearch.java
├── CheckSorted.java
├── RemoveDuplicates.java
├── SecondLargest.java
├── MoveZerosToEnd.java
├── RotateByOne.java
├── RotateByK.java
├── CountEvenOdd.java
├── FrequencyElements.java
├── MissingNumber.java
├── DuplicateNumber.java
├── UnionArrays.java
├── IntersectionArrays.java
├── PairWithGivenSum.java
├── MaximumSubarrayBruteForce.java
├── KadaneAlgorithm.java
├── PrefixSumArray.java
├── DifferenceArray.java
├── EquilibriumIndex.java
└── MajorityElement.java
```

---

## 🎯 Learning Objectives

By completing these 25 problems, you will learn how to:

* Traverse arrays efficiently
* Identify common DSA patterns
* Analyze time and space complexity
* Optimize brute-force solutions
* Build interview-ready coding skills

---

## 🧠 Summary of Techniques Used

| Technique           | Used In                             |
| ------------------- | ----------------------------------- |
| Linear Scan         | Max, Min, Sum, Search               |
| Two Pointers        | Reverse Array, Move Zeros           |
| Hashing             | Frequency Count, Pair Sum           |
| Prefix Sum          | Prefix Sum Array, Equilibrium Index |
| Sorting             | Remove Duplicates                   |
| Dynamic Programming | Kadane’s Algorithm                  |

---

## 📋 Problems List

| #  | Problem                             | Definition                               | Technique           | Time     | Space    | Java File                        |
| -- | ----------------------------------- | ---------------------------------------- | ------------------- | -------- | -------- | -------------------------------- |
| 1  | Find Maximum Element                | Find the largest value in the array      | Linear Scan         | O(n)     | O(1)     | `MaxNum.java`                    |
| 2  | Find Minimum Element                | Find the smallest value in the array     | Linear Scan         | O(n)     | O(1)     | `MinNum.java`                    |
| 3  | Reverse an Array                    | Reverse all elements in place            | Two Pointers        | O(n)     | O(1)     | `ReverseArray.java`              |
| 4  | Find Sum of Array Elements          | Compute total of all elements            | Linear Scan         | O(n)     | O(1)     | `SumArray.java`                  |
| 5  | Find Average of Array               | Sum all elements and divide by size      | Linear Scan         | O(n)     | O(1)     | `AverageArray.java`              |
| 6  | Linear Search                       | Find a target by checking each element   | Linear Scan         | O(n)     | O(1)     | `LinearSearch.java`              |
| 7  | Check if Array is Sorted            | Verify elements are in ascending order   | Linear Scan         | O(n)     | O(1)     | `CheckSorted.java`               |
| 8  | Remove Duplicates from Sorted Array | Keep only unique values                  | Two Pointers        | O(n)     | O(1)     | `RemoveDuplicates.java`          |
| 9  | Find Second Largest Element         | Find the second highest distinct value   | Linear Scan         | O(n)     | O(1)     | `SecondLargest.java`             |
| 10 | Move All Zeros to End               | Shift zeros to the right                 | Two Pointers        | O(n)     | O(1)     | `MoveZerosToEnd.java`            |
| 11 | Rotate Array by 1                   | Shift all elements by one position       | Traversal           | O(n)     | O(1)     | `RotateByOne.java`               |
| 12 | Rotate Array by K Steps             | Rotate by `k` positions                  | Reversal Technique  | O(n)     | O(1)     | `RotateByK.java`                 |
| 13 | Count Even and Odd Numbers          | Count numbers by parity                  | Linear Scan         | O(n)     | O(1)     | `CountEvenOdd.java`              |
| 14 | Find Frequency of Elements          | Count occurrences of each value          | Hashing             | O(n)     | O(n)     | `FrequencyElements.java`         |
| 15 | Find Missing Number (1 to N)        | Detect the absent number                 | Math / XOR          | O(n)     | O(1)     | `MissingNumber.java`             |
| 16 | Find Duplicate Number               | Identify repeated value                  | Hashing             | O(n)     | O(n)     | `DuplicateNumber.java`           |
| 17 | Union of Two Arrays                 | Combine unique elements from both arrays | Hash Set            | O(n + m) | O(n + m) | `UnionArrays.java`               |
| 18 | Intersection of Two Arrays          | Find common elements                     | Hash Set            | O(n + m) | O(n)     | `IntersectionArrays.java`        |
| 19 | Find Pairs with Given Sum           | Detect pairs adding to target            | Hashing             | O(n)     | O(n)     | `PairWithGivenSum.java`          |
| 20 | Maximum Subarray Sum (Brute Force)  | Check all subarrays                      | Nested Loops        | O(n²)    | O(1)     | `MaximumSubarrayBruteForce.java` |
| 21 | Kadane’s Algorithm                  | Efficient maximum subarray sum           | Dynamic Programming | O(n)     | O(1)     | `KadaneAlgorithm.java`           |
| 22 | Prefix Sum Array                    | Precompute cumulative sums               | Prefix Sum          | O(n)     | O(n)     | `PrefixSumArray.java`            |
| 23 | Difference Array                    | Efficient range updates                  | Difference Array    | O(n)     | O(n)     | `DifferenceArray.java`           |
| 24 | Equilibrium Index                   | Left sum equals right sum                | Prefix Sum          | O(n)     | O(1)     | `EquilibriumIndex.java`          |
| 25 | Majority Element (Basic)            | Element appearing more than n/2 times    | Hashing             | O(n)     | O(n)     | `MajorityElement.java`           |

---

## 🚀 How to Run

```bash
javac MaxNum.java
java MaxNum
```

Replace `MaxNum` with any class name you want to execute.

---

## 📈 Complexity Guide

* **O(1)** → Constant time
* **O(log n)** → Binary reduction
* **O(n)** → Single traversal
* **O(n log n)** → Sorting-based solutions
* **O(n²)** → Nested loops

---

## 🏆 Goal

Complete these 25 problems to build a strong foundation in arrays before moving to:

* Strings
* Linked Lists
* Stacks and Queues
* Trees
* Graphs
* Dynamic Programming

---

## 👨‍💻 Author

Daya — Java Full Stack Developer and DSA Learner.
