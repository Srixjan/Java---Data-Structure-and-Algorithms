public class pallindromeNumber {
    public boolean isPallindrome(int n) {
        if (n < 0) {
            return false;
        }

        int rev = 0;
        int ncopy = n;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n  = n / 10;
        }
        return rev == ncopy;
    }

    public static void main(String[] args) {
        int n = 1221;
        pallindromeNumber pal = new pallindromeNumber();
        boolean result = pal.isPallindrome(n);
        System.out.println(result);
    }
}
