import java.util.*;
public class generateBinaryStringsWithConsecutive1s {
    private void backtrack(String s, int n, char prev, List<String> result) {
        if (s.length() == n) {
            result.add(s);
            return;
        }
        backtrack(s + "0", n, '0', result);
        if (prev != '1') {
            backtrack(s + "1", n, '1', result);
        }
    }

    public List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", n, '0', result);
        return result;
    }
    public static void main(String[] args) {
        generateBinaryStringsWithConsecutive1s gen =  new generateBinaryStringsWithConsecutive1s();
        int n = 3;
        List<String> res = gen.generateBinaryStrings(n);
        for (String str : res) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
