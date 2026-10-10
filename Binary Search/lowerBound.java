import java.util.Arrays;

public class lowerBound {
    public int lowerbound(int[] nums, int x) {
        int ans = nums.length;
        int low = 0; 
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
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

        lowerBound low = new lowerBound();
        int result = low.lowerbound(nums, x);
        System.out.print("the lower bound value is: "+result);
    }
}
