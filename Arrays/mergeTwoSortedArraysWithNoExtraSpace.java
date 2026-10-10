import java.util.*;
public class mergeTwoSortedArraysWithNoExtraSpace {
    public void merge(int[] nums1, int m, int nums2[],  int n) {
        int i = m - 1; // nums 1
        int j = n - 1; // nums 2

        int ind = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[ind] = nums1[i];

                ind--;
                i--;
            } else {
                nums1[ind] = nums2[j];

                ind--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int[] nums2 = {-3, 1, 8};
        int m = 4, n = 3;

        mergeTwoSortedArraysWithNoExtraSpace mer = new mergeTwoSortedArraysWithNoExtraSpace();
        mer.merge(nums1, m, nums2, n);

        System.out.println("The merged arrays is:");
        System.out.print("nums1[] = ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}