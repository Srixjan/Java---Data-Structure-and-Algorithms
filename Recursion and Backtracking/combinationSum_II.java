import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        Arrays.sort(candidates);

        func(0, target, nums, candidates, ans);
        return ans;
    }

    private void func(int idx, int sum, List<Integer> nums, int[] candidates, List<List<Integer>> ans) {
        if (sum == 0) {
            ans.add(new ArrayList<>(nums));
            return;
        }

        if (sum < 0 || idx == candidates.length) {
            return;
        }

        nums.add(candidates[idx]);
        func(idx + 1, sum - candidates[idx], nums, candidates, ans);
        nums.remove(nums.size()-1);

        for(int i = idx + 1; i < candidates.length; i++) {
            if(candidates[i] != candidates[idx]) {
                func(i, sum, nums, candidates, ans);
                break;
            }
        }
    }

    public static void main(String[] args) {

        combinationSum_II comb = new combinationSum_II();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
 
        List<List<Integer>> result = comb.combinationSum2(candidates, target);
 
        System.out.println("Combinations are: ");
        for (List<Integer> combination : result) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
