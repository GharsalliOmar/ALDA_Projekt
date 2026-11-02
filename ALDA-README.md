# ALDA Projekt – Tree Search Algorithms in Java

A Java project from the course *Algorithms and Data Structures* (FH Campus Wien).
It implements a **tree data structure** and **three search algorithms** on it, to compare how they work and how they perform.

## Features
- Custom tree implementation (insert, inorder, search)
- Three search algorithms:
  1. **[ALGORITHMUS 1, Bubble Sort]** – [Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order until the entire list is sorted.]
  2. **[ALGORITHMUS 2, Selection Sort]** – [Selection Sort repeatedly finds the smallest element in the unsorted portion and swaps it with the first unsorted element until the entire list is sorted.]
  3. **[ALGORITHMUS 3, Insertion Sort]** – [Insertion Sort builds a sorted portion by taking each element and inserting it into its correct position among the previously sorted elements.]

## Complexity

| Algorithm        | Time    | Space  |
|------------------|---------|--------|
| [Bubble Sort]    | [O(n²)] | [O(n)  |
| [Selection Sort] | [O(n²)] | [O(n)  |
| [Insertion Sort] | [O(n²)] | [O(n)  |

## Tech
- Java
- No external libraries

## How to run
1. Clone the repository
   ```bash
   git clone https://github.com/GharsalliOmar/ALDA_Projekt.git
   ```
2. Open the folder in IntelliJ IDEA (or any Java IDE)
3. Run `Main.java` in `src/main/java`

## Project structure
```
src/main/java/
├── BinaryTree.java
├── Book.java
├── Sorting.java
└── Main.java
```

## What I learned
- Implementing a tree structure from scratch
- Differences between search strategies and when each one is the better choice
- Analysing time and space complexity
