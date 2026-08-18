public class moveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                j=i;
                break;       
            }
        }
        for (int i = j+1; i < n; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }   
        }
    }

    public static void main(String[] argss) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZerosToEnd sol = new moveZerosToEnd();
        sol.moveZeroes(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }

    }
}
