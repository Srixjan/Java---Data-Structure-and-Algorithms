import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        func(0, 0, nums, ans);
        return ans;
    }

    private void func(int idx, int sum, int[] nums, List<Integer> ans) {
        if (idx == nums.length) {
            ans.add(sum);
            return;
        }

        func(idx+1, sum+nums[idx], nums, ans);
        func(idx+1, sum, nums, ans);
    }    

    public static void main(String[] args) {        
        subsets sum = new subsets();
        int[] nums = {1, 2, 3};
        List<Integer> result = sum.subsetSums(nums);
        
        System.out.println("Subset sums are: " + result);
    }
}
