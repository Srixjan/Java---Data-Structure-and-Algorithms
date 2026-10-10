import java.util.Arrays;

public class bubbleSort {
    public int[] sort(int[] nums) {
        int n = nums.length;
        for(int i = n - 1; i >= 1; i--) {
            boolean isSwapped = true;
            for(int j = 0; j <= i - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        bubbleSort solution = new bubbleSort();
        
        int[] nums = {7, 4, 1, 5, 3};
        
        System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));

        nums = solution.sort(nums);

        System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));
    }
}
