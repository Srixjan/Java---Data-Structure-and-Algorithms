import java.util.*;
public class highestOccuringElementinanArray {
    public int mostFrequentElement(int[] nums) {
        int n = nums.length;
        int maxFreq = 0;
        int maxEle = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); 
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }
        // 1. We are using a HashMap called 'mpp' to keep track of how many times each number appears in the array 'nums'.
        // 2. We loop through each number in the array 'nums' using a for loop.
        // 3. For each number (nums[i]), we check if it is already in the HashMap 'mpp' using the getOrDefault method.
        //    - If the number is already in the map, getOrDefault will return its current count (the value associated with that key).
        //    - If the number is not in the map, getOrDefault will return 0 (the default value we provided).
        // 4. We then add 1 to this count (because we have seen this number one more time) and put it back into the map with the same key (the number itself).  

        for (Map.Entry<Integer, Integer> it: mpp.entrySet()) { 
            // 5. We use a for-each loop to iterate through each entry in the HashMap 'mpp'. Each entry consists of a key (the number) and a value (the count of occurrences).
            int ele = it.getKey();
            int freq = it.getValue();

            // 6. Inside the loop, we retrieve the key (the number) and its corresponding value (the count of occurrences) for each entry in the HashMap.

            if (freq > maxFreq) {
                maxFreq = freq;
                maxEle = ele;
            } else if(freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            }
            // 7. We check if the current frequency (freq) is greater than the maximum frequency (maxFreq) we have seen so far.
            //    - If it is, we update maxFreq to be the current frequency and maxEle to be the current number (ele).
            // 8. If the current frequency is equal to the maximum frequency, we compare the current number (ele) with the current maximum element (maxEle) and update maxEle to be the smaller of the two. 
            // This ensures that if there are multiple numbers with the same maximum frequency, we return the smallest one.
            // 9. After the loop, we return maxEle, which is the number that occurs most frequently in the array (or the smallest number among those with the same maximum frequency).
        }
        return maxEle;
    }  // 10. The method returns the number that occurs most frequently in the array (or the smallest number among those with the same maximum frequency).

    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 5, 6};
        highestOccuringElementinanArray high = new highestOccuringElementinanArray();
        int ans = (high.mostFrequentElement(nums));
        System.out.print(ans);
    }
}

