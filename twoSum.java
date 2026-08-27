import java.util.*;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int[][] eleIdx = new int[n][2];
        for(int i = 0; i < n; i++) {
            eleIdx[i][0] = nums[i];
            eleIdx[i][1] = i;
        }

        Arrays.sort(eleIdx, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            } 
        });

        int left = 0, right = n - 1;

        while(left < right) {
            int sum = eleIdx[left][0] + eleIdx[right][0];
            if (sum == target) {
                ans[0] = eleIdx[left][1];
                ans[1] = eleIdx[right][1];
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        twoSum sum = new twoSum();
        int[] ans = sum.twoSum(nums, target);

        System.out.println("Indices of the two numbers that sum up to " + target + " are: [" + ans[0] + ", " + ans[1] + "]");
    }
}
