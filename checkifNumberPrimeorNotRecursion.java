public class checkifNumberPrimeorNotRecursion {
    public int[] reverseArray(int[] nums) {
        rev(nums, 0, nums.length-1);
        return nums;
    }

    private void rev (int[] nums, int left, int right) {
        if(left >= right) {
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        rev(nums, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        checkifNumberPrimeorNotRecursion rev = new checkifNumberPrimeorNotRecursion();
        int[] result = rev.reverseArray(nums);
        for (int n : result) {
            System.out.print(n);
        }
    }
}
