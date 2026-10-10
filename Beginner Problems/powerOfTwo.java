public class powerOfTwo {
    public boolean isPowerTwo(int n) {
        if (n == 1) {
            return true;
        }

        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        return isPowerTwo(n/2);
    }

    public static void main(String[] args) {
        int n = 3;
        powerOfTwo pow = new powerOfTwo();

        boolean ans = pow.isPowerTwo(n);
        System.out.print("The  boolean value in correspondece to it being power of two or not of " +n+ " is "+ ans);
    }
}
