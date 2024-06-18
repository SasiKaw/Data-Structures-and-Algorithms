def selectionSort(arr, order):
    for i in range(0, len(arr)):
        min = i
        j = i + 1
        for j in range(j, len(arr)):
            if(order == "asc"):
                if(arr[j] < arr[min]):
                    min = j
            elif(order == "desc"):
                if(arr[j] > arr[min]):
                    min = j
        if(min != i):
            temp = arr[i]
            arr[i] = arr[min]
            arr[min] = temp
    return arr

if __name__ == '__main__':

    arr = []  
    n = int(input("Enter number of elements: "))
    for i in range(0, n):
        ele = int(input("Enter element:"))
        arr.append(ele)

    order = input("Enter order of sorting (asc/desc): ")
    
    print("Original Array: ", arr)

    print("Sorted array: " + str(selectionSort(arr, order)))