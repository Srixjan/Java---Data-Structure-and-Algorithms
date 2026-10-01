import java.util.*;
public class countGoodNumbers {
    final long MOD = 1000000007;

    public int countGoodNumber(long n) {
        long evenPostion = (n + 1)/ 2;
        long oddPosition = n / 2;

        long res = (modPow(5, evenPostion) * modPow(4, oddPosition)) % MOD;
        return (int) res;
    }

    private long modPow(long base, long exp) {
        long result = 1;

        base %= MOD;

        while(exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
             
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        countGoodNumbers obj = new countGoodNumbers();
        // Print total good numbers
        System.out.println(obj.countGoodNumber(n));
        sc.close();
    }
}
