import java.util.*;
public class leadersInArray {
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        if(nums.length == 0) {
            return ans;
        }

        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
        leadersInArray lead = new leadersInArray();
        List<Integer> ans = lead.leaders(nums);
        for(int num : ans) {
            System.out.print(num+ " ");
        }
    }
}