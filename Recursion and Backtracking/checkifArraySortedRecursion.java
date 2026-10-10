import java.util.*;
public class checkifArraySortedRecursion {
    public boolean arraySort(ArrayList<Integer> nums) {
        if(nums.size() <= 1) {
            return true;
        }

        return sort(nums, 0, 1);
    }

    private boolean sort(ArrayList<Integer> nums, int left, int right) {
        if(right >= nums.size()) {
            return true;
        }

        if(nums.get(left) > nums.get(right)) {
            return false;
        }

        return sort(nums, left + 1, right + 1);
    }

    public static void main(String[] args) {
        checkifArraySortedRecursion solution = new checkifArraySortedRecursion();
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5)); 
        boolean result = solution.arraySort(nums); 
        System.out.println(result ? "Array is sorted" : "Array is not sorted"); 
    }
}
