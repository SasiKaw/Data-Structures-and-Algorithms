def bubbleSort(arr):
    size = len(arr)

    # outer loop invariant
    for i in range(size - 1):
        # inner loop invariant
        for j in range(size - i - 1):
            # Compare two adjacent elements
            if(arr[j] > arr[j + 1]):
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr;

data = [3, 2, 4, 7, 9]
print(bubbleSort(data))