public class reverseArrayRecursion {
    public int[] reverseArray(int[] nums) {
        reverse(nums, 0, nums.length - 1);
        return nums;
    }

    private void reverse(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        reverse(nums, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] nums = {9, 1, 3, 4, 6, 0, 1, 7, 1, 0};
        reverseArrayRecursion rev = new reverseArrayRecursion();
        int[] result = rev.reverseArray(nums);
        for(int n : result){
            System.out.print(n+", ");
        }
    }
}
