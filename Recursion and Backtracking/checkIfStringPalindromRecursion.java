import java.util.*;
public class checkIfStringPalindromRecursion {
    private boolean pallindrome(String s, int left, int right) {
        if (left >= right)
            return true;

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return pallindrome(s, left + 1, right - 1);
    }

    public boolean checkPallidrome(String s) {
        return pallindrome(s, 0, s.length()-1);
    }

    public static void main(String[] args) {
        String s = "HANNAH";
        checkIfStringPalindromRecursion check = new checkIfStringPalindromRecursion();
        System.out.print(check.checkPallidrome(s));
    }
}
