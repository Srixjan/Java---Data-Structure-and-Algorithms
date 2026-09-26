public class splitArray_LargestSum {
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = a[0];
        int high = 0;
        for(int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }
        while(low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);

            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int countPartitions(int[] a, int maxSum) {
        int n = a.length;
        int partitions = 1;
        int subarraySum = 0;
        for(int i = 0; i < n; i++) {
            if (subarraySum + a[i] <= maxSum) {
                subarraySum += a[i];
            } else {
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
 
        splitArray_LargestSum split = new splitArray_LargestSum();
        
        int ans = split    .largestSubarraySumMinimized(a, k);
 
        System.out.println("The answer is: " + ans);
    }
}


