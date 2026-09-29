import java.util.*;
public class containsDuplicates {
    public boolean duplicates(int[] nums) {
        HashSet<Integer> seek = new HashSet<>();
        for (int n : nums) {
            if (seek.contains(n)) {
                return true;
            }
            seek.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 6, 7, 8, 9};
        containsDuplicates dupe = new containsDuplicates();
        System.out.println(dupe.duplicates(nums));
    }
}
