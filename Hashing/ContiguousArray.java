import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLenght(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 1, 0, 0, 0, 0};
        ContiguousArray cont = new ContiguousArray();
        System.out.print("Just take the answer man! -> "+cont.findMaxLenght(arr));
    }
}
