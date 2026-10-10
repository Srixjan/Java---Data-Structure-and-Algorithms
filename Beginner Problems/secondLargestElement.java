import java.util.*;
public class secondLargestElement{
    public int secLargest(int[] nums) {
        if(nums.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            }

            else if (nums[i] > sLargest && nums[i] != largest) {
                sLargest = nums[i];
            }
        }
        return sLargest == Integer.MIN_VALUE ? -1 : sLargest;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 7, 5};
        secondLargestElement sLarge = new secondLargestElement();
        int sL = sLarge.secLargest(nums);

        System.out.println("Second largest is " + sL);
    }
}