public class searchInRotatedSortedArray_II {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 7; 

        searchInRotatedSortedArray_II rotate = new searchInRotatedSortedArray_II();

        boolean result = rotate.search(nums, k);

        if (!result)
            System.out.println("k is not present.");
        else
            System.out.println("k is present in the array.");
    }
}