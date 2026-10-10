public class Power_X_n {
    public double myPow(double x, int n) {
        long num = n;
        if (n < 0) {
            return power(1.0 /x, -num);
        }

        return power(x, num);
    }

    public double power(double x, long n) {
        if (n == 0) return 1;
        
        if (n == 1) return x;

        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }

        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        Power_X_n pow = new Power_X_n();
        System.out.println(pow.myPow(2.0, 10));
    }
}
