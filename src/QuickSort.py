def quicksort(arr, low, high):
    if (low < high):
        partitionInd = partition(arr, low, high)
        quicksort(arr, low, partitionInd - 1)
        quicksort(arr, partitionInd + 1, high)

def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if (arr[j] <= pivot):
            i = i + 1
            swap(arr, i, j)
    swap(arr, i + 1, high)
    return i + 1

def swap(arr, i, j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp

nums = [0, 5, 2, 7, 1]
quicksort(nums, 0, len(nums) - 1)
print(nums)