import java.util.ArrayList;
import java.util.Arrays;

public class findMinimumInRotatedSortedArray {
    public int findMin(ArrayList<Integer> arr) {
        int low = 0, high = arr.size() - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(low) <= arr.get(mid)) {
                ans = Math.min(ans, arr.get(low));
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr.get(mid));
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 69, 1, 2, 3));

        findMinimumInRotatedSortedArray find = new findMinimumInRotatedSortedArray();
        
        int ans = find.findMin(arr);
        
        System.out.println("The minimum element is: " + ans);
    }
}
