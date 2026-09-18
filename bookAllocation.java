public class bookAllocation {
    public int findPages(int[] nums, int s) {
        int n = nums.length;
        if (s > n) return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(nums, mid);
            if (students > s) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int countStudents(int[] nums, int pages) {
        int n = nums.length;
        int stud = 1;
        int pageStuds = 0;

        for(int i = 0; i < n; i++) {
            if (pageStuds + nums[i] <= pages) {
                pageStuds += nums[i];
            } else {
                stud++;
                pageStuds = nums[i];
            }
        }
        return stud;
    }

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;

        bookAllocation bookAlloc = new bookAllocation();

        int ans = bookAlloc.findPages(arr, m);

        System.out.println("The answer is: " + ans);
    }
}
