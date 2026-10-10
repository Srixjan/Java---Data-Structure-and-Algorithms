import java.util.*;
public class kokoEatingBananas {
    private int findMax(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i : nums) {
            maxi = Math.max(maxi, i);
        }
        return maxi;
    }

    private long calculateTotalHours(int[] nums, int hour) {    
        long totalH = 0;

        for (int i : nums) {
            totalH += Math.ceil((double) i / (double) hour);
        }
        return totalH;
    }


public int minimumRateToEatBananas(int[] nums, int h) {
    int low = 1, high = findMax(nums);
    while(low <= high) {
        int mid = (low + high) / 2;
        long totalH = calculateTotalHours(nums, mid);
        if (totalH <= h) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return low;
}
    public static void main(String[] args) {
        int[] nums = {7, 15, 6, 3};
        int h = 8;

        kokoEatingBananas koko = new kokoEatingBananas();

        int ans = koko.minimumRateToEatBananas(nums, h);

        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
