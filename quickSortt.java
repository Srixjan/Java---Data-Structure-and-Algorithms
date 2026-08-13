import java.util.*;

public class quickSortt {
    // Function to partition the array
    public int partition(int[] arr, int low, int high) {

        // Choosing a random index between low and high
        int randomIndex = low + new Random().nextInt(high - low + 1);
        // Swap the random element with the first element
        swap(arr, low, randomIndex);

        // Now choosing arr[low] as the pivot after the swap
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Move i to the right until we find an element greater than pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            // Move j to the left until we find an element smaller than pivot
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            // Swap if valid
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place pivot in correct position
        swap(arr, low, j);
        return j;
    }

    // Helper Function to perform recursive quick sort
    public void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1, high);
        }
    }

    // Function to perform quick sort
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }
    
    // Custom swap function
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSortt solution = new quickSortt();
        int[] sortedArr = solution.quickSort(arr);

        System.out.println("After Sorting Array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

