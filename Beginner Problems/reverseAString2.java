import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseAString2 {
    public void reverseString(List<Character> s) {
        int left = 0, right = s.size() - 1;
        while(left < right) {
            char ch = s.get(left);
            s.set(left, s.get(right));
            s.set(right, ch);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        List<Character> str = new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        reverseAString2 rev = new reverseAString2();
        rev.reverseString(str);

        for (char c : str) {
            System.out.print(c);
        }

    }
}
