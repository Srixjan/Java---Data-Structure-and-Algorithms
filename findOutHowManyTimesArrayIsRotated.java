import java.util.ArrayList;
import java.util.Arrays;

public class findOutHowManyTimesArrayIsRotated {
    public int findRotation(ArrayList<Integer> nums) {
        int low = 0, high = nums.size() - 1;
        int ans = Integer.MAX_VALUE;
        int idx = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums.get(low) <= nums.get(high)) {
                if (nums.get(low) < ans) {
                    idx = low;
                    ans = nums.get(low);
                }
                break;
            }

            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) <= ans) {
                    idx = low;
                    low = mid + 1;
                } else {
                    if (nums.get(mid) < ans) {
                        idx = mid;
                        ans = nums.get(mid);
                    }
                    high = mid - 1;
                }
            } 
        }
        return idx;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
        
        findOutHowManyTimesArrayIsRotated count = new findOutHowManyTimesArrayIsRotated();
        
        int ans = count.findRotation(nums);
        
        System.out.println("The array is rotated " + ans + " times.");
    }
}
