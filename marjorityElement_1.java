public class marjorityElement_1 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(cnt == 0) {
                cnt =  1;
                el = nums[i];
            } else if(el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        if (cnt1 > (n/2)) {
            return el;
        }

        return -1;
    }

    public static void main(String[] args) {
        marjorityElement_1 maj = new marjorityElement_1();
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int ans = maj.majorityElement(arr);
        System.out.print(ans);
    }
}
