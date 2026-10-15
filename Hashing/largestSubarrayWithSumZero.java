import java.util.HashMap;
import java.util.Map;

public class largestSubarrayWithSumZero {
    public int maxLen(int[] arr) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }

            else if(sumMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumMap.get(sum));
            } else {
                sumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        largestSubarrayWithSumZero large = new largestSubarrayWithSumZero();
        int[] arr = {1, -1, 3, 2, -2, 4, -4};
        System.out.print("The largest SUBARRAY with SUM 0 -> "+ large.maxLen(arr));
    }
}
