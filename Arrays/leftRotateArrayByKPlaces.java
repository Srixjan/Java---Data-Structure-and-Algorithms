public class leftRotateArrayByKPlaces {
    private void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);
        reverseArray(nums, 0, n-1);
    }

    public void printArray(int[] nums) {
        for(int val : nums) {
            System.out.print(val+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;
        
        leftRotateArrayByKPlaces left = new leftRotateArrayByKPlaces();

        System.out.println("Initial Array: ");
        left.printArray(arr);
        
        left.rotateArray(arr, k);
        System.out.println("Arrays after rotating elements: "+ k +"places: ");
        left.printArray(arr);
    }
}
