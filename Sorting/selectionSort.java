// import java.util.*;
public class selectionSort {
    public int[] selectSort(int[] nums) {
        for (int i = 0; i < nums.length-1;i++) {
            int minIdx = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            if(minIdx != i) {
                int temp = nums[i];
                nums[i] = nums[minIdx];
                nums[minIdx] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};

    System.out.print("Original array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
        selectionSort solution = new selectionSort();

    int[] sortedArr = solution.selectSort(arr);

    System.out.print("Sorted array: ");
    for (int num : sortedArr) {
      System.out.print(num + " ");
    }
    System.out.println();
    }
}