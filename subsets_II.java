import java.util.*;
public class subsets_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        func(0, arr, nums, ans);
        return ans;
    }

    private void func(int idx, List<Integer> arr, int[] nums, List<List<Integer>> ans){
        if (idx == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[idx]);
        func(idx+1, arr, nums, ans);
        arr.remove(arr.size()-1);

        for(int j = idx + 1; j < nums.length; j++) {
            if (nums[j] != nums[idx]) {
                func(j, arr, nums, ans); 
                return;
            }
        }

        func(nums.length, arr, nums, ans);
    }

    public static void main(String[] args) {
        subsets_II sub = new subsets_II();
        int[] nums = {1, 2, 2};  
        List<List<Integer>> result = sub.subsetsWithDup(nums);
        
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
    
}