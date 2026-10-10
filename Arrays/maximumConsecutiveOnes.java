public class maximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxOne = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxOne = Math.max(count, maxOne);
            } else {
                count = 0;
            }
        }
        return maxOne;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 1, 1, 0, 1};
        maximumConsecutiveOnes find = new maximumConsecutiveOnes();
        int results = find.findMaxConsecutiveOnes(arr);
        System.out.print(results);
    }
}
