public class powerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        return (n % 3 == 0) && isPowerOfThree(n/3);
    }

    public static void main(String[] args) {
        int n = 27;
        powerOfThree pow = new powerOfThree();
        boolean ans = pow.isPowerOfThree(n);
        System.out.print(ans);
    }
}
