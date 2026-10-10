import java.util.*;
public class sumOfHighestAndLowestFrequency {
    public int sumHighAndLow(int[] nums) {
        int n = nums.length;
        int maxFreq = 0, minFreq = n;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        } 

        for(int freq : mpp.values()) {
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }
        return maxFreq + minFreq;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        sumOfHighestAndLowestFrequency highAndLow = new sumOfHighestAndLowestFrequency();
        System.out.println(highAndLow.sumHighAndLow(nums));
    }
}
