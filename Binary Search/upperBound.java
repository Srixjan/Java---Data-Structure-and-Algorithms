import java.util.*;
public class upperBound {
    public int upperbound(int[] nums, int x) {
        int ans = nums.length;
        int low = 0; 
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {44, 63, 81, 1, 3, 33};
        Arrays.sort(nums);
        int x = 16;

        upperBound up = new upperBound();
        int result = up.upperbound(nums, x);
        System.out.print("the upper bound value is: "+result);
    }
}
