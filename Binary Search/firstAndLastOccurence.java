public class firstAndLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurence(nums, target);
        if (first == -1) return new int[] {-1, -1};
        int last = findLastOccurence(nums, target);
        return new int[] {first, last};
    }

    private int findFirstOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ansf = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
        
            if (nums[mid] == target) {
                ansf = mid;
                high = mid - 1;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ansf;
    }

    private int findLastOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ansl = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ansl = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ansl;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};  
        int target = 8; 

        firstAndLastOccurence fl = new firstAndLastOccurence();

        int[] result = fl.searchRange(nums, target);

        System.out.println("The first and last occurrences are at indices: " 
                           + result[0] + " and " + result[1]);
    }
}
