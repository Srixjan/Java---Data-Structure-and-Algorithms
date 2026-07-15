import java.util.*;

public class prime_function {
    public static void primerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n) {

        // corner cases
        // 1
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;// return false;
                break;// can also write return isPrime;
            }
        }
        return isPrime; // return true;
    }

    public static boolean OptimizedPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // System.out.println(isPrime(7));
        // System.out.println(OptimizedPrime(16));
        primerange(1056 );
    }
}
