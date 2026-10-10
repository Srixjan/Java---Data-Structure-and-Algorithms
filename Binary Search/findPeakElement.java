public class findPeakElement {
    public int Peak(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n-1] > nums[n-2]) return n - 1;

        int low = 1, high = n - 2;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        
        findPeakElement peak = new findPeakElement();
        
        int ans = peak.Peak(nums);
        
        System.out.println("The peak is at index: " + ans);
    }
}
