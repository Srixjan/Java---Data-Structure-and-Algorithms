import java.util.Arrays;

public class reverseAnArray {
    public int[] reverse(int[] arr, int n) {
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        reverseAnArray rev = new reverseAnArray();
        System.out.println(Arrays.toString(rev.reverse(arr, l)));
    }
}