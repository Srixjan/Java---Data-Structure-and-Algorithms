public class stringPalindromeCheck {
    public boolean palindromeCheck(String s) {
        int start = 0, end = s.length() - 1;
        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "FORMULA";
        stringPalindromeCheck strPal = new stringPalindromeCheck();
        boolean ans = strPal.palindromeCheck(str);
        System.out.print(ans);
    }
}
