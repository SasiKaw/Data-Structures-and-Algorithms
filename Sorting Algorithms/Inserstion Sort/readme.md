# Insertion Sort

This repository contains an implementation of the Insertion Sort algorithm in Python.

## Algorithm

The Insertion Sort algorithm works by dividing the input array into a sorted and an unsorted region. It iterates through the unsorted region, comparing each element with the elements in the sorted region and inserting it at the correct position.

The steps of the Insertion Sort algorithm are as follows:

1. Start with the second element of the array.
2. Compare the current element with the elements in the sorted region.
3. If the current element is smaller, shift the elements in the sorted region to the right.
4. Insert the current element at the correct position in the sorted region.
5. Repeat steps 2-4 until all elements in the unsorted region are processed.

## Usage

To use the Insertion Sort algorithm, follow these steps:

1. Define an array of elements to be sorted.
2. Call the `insertionSort` function, passing the array as an argument.
3. The function will return the sorted array.

Example usage:

```python
arr = [12, 11, 13, 5, 6]
sorted_array = insertionSort(arr)
print("Sorted array:", sorted_array)
```

## Complexity

The time complexity of the Insertion Sort algorithm is O(n^2) in the worst case, where n is the number of elements in the array. The space complexity is O(1) as it sorts the array in-place.
