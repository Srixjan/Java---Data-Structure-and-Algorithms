public class linearSearch {
    public int linearSearchh(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n-1; i ++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {44, 33, 3, 1, 63, 81, 16};
        int target = 1;
        linearSearch search = new linearSearch();
        System.out.print("The value "+target+" is at index "+ search.linearSearchh(nums, target));
    }
}