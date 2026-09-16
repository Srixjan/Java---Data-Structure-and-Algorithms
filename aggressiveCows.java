import java.util.*;
public class aggressiveCows{
    public int aggCows(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int low = 1, high = nums[n - 1] - nums[0];
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(canWePlace(nums, mid, k) == true) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    private boolean canWePlace(int[] nums, int dist, int cow) {
        int n = nums.length;
        int cntCows = 1;
        int last = nums[0];
        for(int i = 1; i < n; i++) {
            if (nums[i] - last >=  dist) {
                cntCows++;
                last = nums[i];
            } 
            if (cntCows >= cow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 7, 10, 9};
        int k = 4;
       aggressiveCows agg = new aggressiveCows();

        int ans = agg.aggCows(nums, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}