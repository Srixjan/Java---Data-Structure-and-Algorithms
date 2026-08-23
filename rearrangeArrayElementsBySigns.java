public class rearrangeArrayElementsBySigns {
    public int[] rearrange(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int posIdx = 0, negIdx = 1;
        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                ans[negIdx] = nums[i];
                negIdx += 2;
            } else {
                ans[posIdx] = nums[i];
                posIdx += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] S = {2, 4, 5, -1, -3, -4};
        rearrangeArrayElementsBySigns arrange = new rearrangeArrayElementsBySigns();
        int[] ans = arrange.rearrange(S);

        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}
