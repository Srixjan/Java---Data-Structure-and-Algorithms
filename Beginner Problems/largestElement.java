public class largestElement {
    public int largest(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {44, 63, 81, 1, 3, 33, 16};
        largestElement large = new largestElement();
        System.out.print("The largest element is "+large.largest(nums));        
    }
}
