def insertionSort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i-1

        while(j >= 0 and arr[j] > key):
            arr[j+1] = arr[j]
            j = j-1
        arr[j+1] = key
    
    return arr

if __name__ == '__main__':
    arr = [12, 11, 13, 5, 6]
    
    print("Original Array: ", arr)

    print("Sorted array: " + str(insertionSort(arr)))
