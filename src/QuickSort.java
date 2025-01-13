public class QuickSort {

    public static void main(String[] args) {
        int[] array = { 10, 7, 8, 9, 1, 5 };

        System.out.println("Unsorted Array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    // QuickSort method
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                swap(array, i, j);
            }
        }

        // Swap array[i + 1] and the pivot (array[high])
        swap(array, i + 1, high);

        return i + 1; // Return the partition index
    }

    // Swap method
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
