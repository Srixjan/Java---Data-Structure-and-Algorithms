import java.util.*;
public class longestCommonPrefix {
    public String longest(String[] s) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(s);

        String first = s[0];
        String end = s[s.length - 1];

        for(int i = 0; i < Math.min(first.length(), end.length()); i++) {
            if(first.charAt(i) != end.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] star = {"flower", "fluck","flight"};
        longestCommonPrefix lono = new longestCommonPrefix();
        String ans = lono.longest(star);
        System.out.print(ans);
    }
}

