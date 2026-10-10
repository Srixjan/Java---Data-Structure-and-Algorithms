public class checkIfThereSubsequenceWithSumK {
    public boolean checkSubsequences (int[] arr, int k) {
        int n = arr.length;
        return solve(0, n, arr, k);
    }

    public boolean solve(int i, int n, int[] arr, int k) {
        if (k == 0) {
            return true;
        }

        if (k < 0) {
            return false;
        }

        if (i == n) {
            return k == 0;
        }

        return solve(i + 1, n, arr, k-arr[i]) || solve(i + 1, n, arr, k);
    }

    public static void main(String[] args) {
        checkIfThereSubsequenceWithSumK check = new checkIfThereSubsequenceWithSumK();
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        System.out.println(check.checkSubsequences(nums, target)); // Expected output: true
    }
}