public class findMissingNumber {
    public int missingNumber(int[] nums)  {
        int n = nums.length;
        int tSum = (n*(n+1))/2;
        int s2 = 0;
        for (int num : nums) {
            s2 += num;
        }
        int missingNumber = tSum - s2;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4};
        findMissingNumber find = new findMissingNumber();
        int ans = find.missingNumber(nums);
        System.out.print(ans);
    }
}