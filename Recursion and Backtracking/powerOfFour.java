public class powerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        return (n % 4 == 0) && isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        int n = 16;
        powerOfFour pow = new powerOfFour();
        boolean ans = pow.isPowerOfFour(n);
        System.out.print(ans);
    }
}
