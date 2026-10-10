public class floorAndCeilInSortedArray {
    public int[] getResult(int[] nums, int x) {
        int n = nums.length;
        
        int floor = findFloor(nums, x, n);
        int ceil = findCeil(nums, x, n);

        return new int[] {floor, ceil};
    }

    private int findFloor(int[] nums, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private int findCeil(int[] nums, int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 95;

        floorAndCeilInSortedArray get = new floorAndCeilInSortedArray();

        int[] result = get.getResult(nums, x);

        System.out.println("The floor and ceil are: " + result[0] + " " + result[1]);
    }
}