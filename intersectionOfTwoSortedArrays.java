import java.util.*;
public class intersectionOfTwoSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> templist = new ArrayList<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            }

            else {
                templist.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[templist.size()];
        for(int k = 0; k < templist.size(); k++) {
            ans[k] = templist.get(k);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};

        intersectionOfTwoSortedArrays finder = new intersectionOfTwoSortedArrays();

        int[] ans = finder.intersectionArray(nums1, nums2);

        System.out.println("Intersection of nums1 and nums2 is:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
