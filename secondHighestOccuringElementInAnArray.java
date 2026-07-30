import java.util.*;

public class secondHighestOccuringElementInAnArray {
    public int secondMostFrequent(int[] nums) {
        int n = nums.length;
        int maxFreq = 0, secMaxFreq = 0;
        int maxEle = -1, secMaxEle = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> it: mpp.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();

            if(freq > maxFreq) {
                secMaxFreq = maxFreq;
                maxFreq = freq;

                secMaxEle = maxEle;
                maxEle = ele;
            } else if(freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            } else if(freq > secMaxFreq) {
                secMaxFreq = freq;
                secMaxEle = ele;
            } else if(freq == secMaxFreq) {
                secMaxEle = Math.min(secMaxEle, ele);
            }
        }
        return secMaxEle;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 3, 5, 6, 7, 7, 7};
        secondHighestOccuringElementInAnArray secFreqEle = new secondHighestOccuringElementInAnArray();
        int ans = secFreqEle.secondMostFrequent(nums);
        System.out.print(ans);
    }
}
