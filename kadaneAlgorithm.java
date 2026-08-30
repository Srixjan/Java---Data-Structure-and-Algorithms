public class kadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) max;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        kadaneAlgorithm kad = new kadaneAlgorithm();
        int ans = kad.maxSubArray(arr);
        
        System.out.println(ans);
        long fuck = Long.MIN_VALUE;
        System.out.println(fuck);
    }
}