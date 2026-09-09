import java.util.*;
public class countSubarraysWithGivenXorK {
    public int subarraywithXORX(int[] nums, int k) {
        int n = nums.length;
        int xr = 0;

        Map <Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, mpp.getOrDefault(xr, 0)+1);
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];
            int x = xr ^ k;
            cnt += mpp.getOrDefault(x, 0);
            mpp.put(xr, mpp.getOrDefault(xr, 0)+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;

        countSubarraysWithGivenXorK count = new countSubarraysWithGivenXorK();

        int ans = count.subarraywithXORX(a, k);

        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
