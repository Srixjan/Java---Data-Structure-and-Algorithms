public class minimumDaysToMakeMBouquets {
    private boolean possible(int[] nums, int day, int m, int k) {
        int n = nums.length;
        int cnt = 0;
        int noOB = 0;
        for(int i = 0; i < n; i++) {
            if (nums[i] <= day) {
                cnt++;
            } else {
            noOB += (cnt/k);
            cnt = 0;
        }
    }

    noOB += (cnt/k);
    return noOB >= m;
}

    public int roseGarden(int n, int[] nums, int k, int m) {
        //nums is garden
        //n is no of flowers
        //k bouquet size
        // m target bouquets
        long val = (long) m * k;
        if (val > n) return -1;

        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        int low = mini, high = maxi, ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(nums, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7}; 
        
        int n = arr.length;
        
        int k = 3; 
        
        int m = 2; 

        minimumDaysToMakeMBouquets min = new minimumDaysToMakeMBouquets(); 
        
        int ans = min.roseGarden(n, arr, k, m); 

        if (ans == -1) {
            System.out.println("We cannot make m bouquets."); 
        } else {
            System.out.println("We can make bouquets on day " + ans); 
        }
    }
}
