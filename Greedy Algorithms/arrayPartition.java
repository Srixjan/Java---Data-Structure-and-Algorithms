import java.util.*;
public class arrayPartition {
    public int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 3, 2};
        arrayPartition arrayPart = new arrayPartition();
        System.out.println("The Array Pair sum is: "+arrayPart.arrayPairSum(nums));
    }
}
