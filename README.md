# Sorting Techniques in Java

A collection of fundamental sorting algorithms implemented in Java for learning Data Structures and Algorithms (DSA).

## Algorithms Covered

### 1. Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them when they are in the wrong order.

### 2. Selection Sort
Selection Sort finds the smallest element from the unsorted portion and places it at the correct position.

### 3. Insertion Sort
Insertion Sort builds the sorted portion of the array one element at a time by inserting each element into its correct position.

### 4. Merge Sort
Merge Sort uses the Divide and Conquer approach. It divides the array into smaller parts, sorts them recursively, and merges the sorted parts.

## Time and Space Complexity

| Algorithm | Best Case | Average Case | Worst Case | Space |
|-----------|-----------|--------------|------------|-------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |

## Project Structure
Sorting-Techniques-Java/
│
├── BubbleSort.java
├── SelectionSort.java
├── InsertionSort.java
├── MergeSort.java
└── README.md
