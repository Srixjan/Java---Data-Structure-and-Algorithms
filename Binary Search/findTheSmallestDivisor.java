public class findTheSmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold) return -1;

        int maxi = Integer.MIN_VALUE;
        for (int i : nums) {
            maxi = Math.max(maxi, i);
        }

        int low = 1, high = maxi;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int sumByD(int[] nums, int limit) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += (int) Math.ceil((double)i / (double)limit);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int limit = 8;

        findTheSmallestDivisor div = new findTheSmallestDivisor();
        int ans = div.smallestDivisor(nums, limit);

        System.out.println("The minimum divisor is: " + ans);
    }
}
