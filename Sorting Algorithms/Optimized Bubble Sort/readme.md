# Optimized Bubble Sort

This repository contains an implementation of the optimized bubble sort algorithm in Python.

## Algorithm Overview

The optimized bubble sort algorithm is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The optimization in this implementation is that it stops the algorithm if no swaps are made in a pass, indicating that the list is already sorted.

## Usage

To use the `bubbleSort` function, pass in an array of elements to be sorted. The function will return the sorted array.

```python
data = [2, 3, 4, 7, 9]
sorted_data = bubbleSort(data)
print(sorted_data)
```

## Example

Given the input array `[2, 3, 4, 7, 9]`, the `bubbleSort` function will return `[2, 3, 4, 7, 9]`, as the array is already sorted.


