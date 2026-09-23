import java.util.*;
public class limitOccurencesInASortedArray {
    public int[] limitK(int[] nums, int k) {
        int n = nums.length;
        int j = 1;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[j] = nums[i];
                j++;
            }
        }
        int[] ans = new int[j];
        for (int i = 0; i < j; i++) {
            ans[i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        limitOccurencesInASortedArray lim = new limitOccurencesInASortedArray();
        int[] ans = lim.limitK(nums, k);

        System.out.print("array with the k limit is ->"+ Arrays.toString(ans));
    }
}
