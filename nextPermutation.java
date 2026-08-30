public class nextPermutation {
    public void permutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0, n - 1);
        }

        for(int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break; 
            }
        }

        reverse(nums, idx + 1, n - 1);
        return;
    }

      private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        nextPermutation perm = new nextPermutation();

        System.out.print("Given array: ");
        for(int x : nums) System.out.print(x + " ");

        perm.permutation(nums);

        System.out.print("\nNext Permutation: ");
        for(int x : nums) System.out.print(x + " ");
    }
}
