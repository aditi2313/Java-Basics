def swap(arr, i, j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp

def quicksort(arr, low, high):
    if (low < high):
        partitionIndex = partition(arr, low, high)
        quicksort(arr, low, partitionIndex - 1)
        quicksort(arr, partitionIndex + 1, high)
    
def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if (arr[j] <= pivot):
            i = i + 1
            swap(arr, i, j)
    swap(arr, i + 1, high)
    return i + 1

arr = [0, 4, 5, 8, 5, 1]
quicksort(arr, 0, len(arr) - 1)
print(arr)