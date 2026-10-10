public class insertionSort {
    public int[] iSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        insertionSort sort = new insertionSort();
        int[] nums = {44, 63, 16, 3, 1, 33, 63, 55, 81};

        System.out.print("Before using Insertion Sort: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        nums = sort.iSort(nums);
        System.out.print("After using Insertion Sort: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}









// public class insertionSort {
//     public int[] sort(int[] nums) {
//         int n = nums.length;
//         for(int i = 1; i < n; i++) {
//             int j = i;
//             while(j > 0 && nums[j-1] > nums[j]) {
//                 int temp = nums[j];
//                 nums[j] = nums[j-1];
//                 nums[j-1] = temp;
//                 j--;
//             } 
//         }
//         return nums;
//     }
//     public static void main(String[] args) {

//         insertionSort solution = new insertionSort();
        
//         int[] nums = {13, 46, 24, 52, 20, 9};
        
//         System.out.println("Before Using Insertion Sort: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
        

//         nums = solution.sort(nums);
        
//         System.out.println("After Using Insertion Sort: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

// }


