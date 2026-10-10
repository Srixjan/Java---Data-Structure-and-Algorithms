public class sumOfArrayElementsRecursion {
    public int arraySum(int[] nums, int left) {
        if (left >= nums.length) return 0;
        return nums[left] + arraySum(nums, left + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int left = 0;
        sumOfArrayElementsRecursion sum = new sumOfArrayElementsRecursion();
        System.out.print(sum.arraySum(nums, left));
    }
}
