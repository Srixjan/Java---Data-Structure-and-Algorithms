import java.util.Arrays;

public class DivisorsofaNumber {
    public int[] divisor(int n) {
        int[] temp = new int[n];
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                temp[count++] = i;
            }

        }
        int[] ans = Arrays.copyOf(temp, count);
        return ans;
    }   

    public static void main(String[] args) {
        int N = 6;
        DivisorsofaNumber div = new DivisorsofaNumber();
        int[] ans = div.divisor(N);
        
        System.out.print("The divisors of " + N + " are: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
