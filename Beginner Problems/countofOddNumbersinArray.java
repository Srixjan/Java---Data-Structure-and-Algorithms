public class countofOddNumbersinArray {
    public int countOdd(int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] N = {1, 2, 3, 4, 5};
        int a = N.length;
        countofOddNumbersinArray odd = new countofOddNumbersinArray();
        int ans = odd.countOdd(N, a);
        System.out.print(ans);
    }
}
