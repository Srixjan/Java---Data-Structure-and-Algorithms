import java.util.*;
public class mergeSort {
    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public void mergeSortHelper(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int mid = ( low + high )/2;
        mergeSortHelper(arr, low, mid);
        mergeSortHelper(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public int[] mergeSSort(int[] nums) {
        int n = nums.length;
        mergeSortHelper(nums, 0, n-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Create an instance of the Solution class
        mergeSort sol = new mergeSort();
        // Function call to sort the array
        int[] sortedArr = sol.mergeSSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(sortedArr[i] + " ");
        System.out.println();
    }
}
