public class removeDuplicatesFromSortedArray {
    public int removeDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j = 1; j < n; j++) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        
        removeDuplicatesFromSortedArray remove = new removeDuplicatesFromSortedArray();
        

        int k = remove.removeDuplicate(nums);
        
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
