import java.util.*;
public class unionOfTwoSortedArrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while(i < n && j < m) {
            if(nums1[i] <= nums2[j]) {
                if(Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                    Union.add(nums1[i]);
                }
                i++;
            }

            else {
                if(Union.isEmpty() || Union.get(Union.size() - 1) != nums2[j]) {
                    Union.add(nums2[j]);
                }
                j++;
            } 
        }
        while (i < n) {
            if(Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                Union.add(nums1[i]);
            }
            i++;
        }

        while(j < m) {
            if(Union.isEmpty() || Union.get(Union.size() - 1) != nums2[j]){
                Union.add(nums2[j]);
            }
            j++;
        }

        int[] Unionn = new int[Union.size()];
        int k = 0;
        for(int num : Union) {
            Unionn[k++] = num;
        }

        return Unionn;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

        unionOfTwoSortedArrays finder = new unionOfTwoSortedArrays();

        int[] Union = finder.unionArray(nums1, nums2);

        System.out.println("Union of nums1 and nums2 is:");
        for (int val : Union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}