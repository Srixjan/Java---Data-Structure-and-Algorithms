import java.util.ArrayList;
import java.util.List;

public class pallindromePartioning{
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(0, s, path, res);
        return res;
    }

    private boolean isPallindrom(String s, int left, int right) {
        while(left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    private void dfs (int index, String s, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPallindrom(s, index, i)) {
                path.add(s.substring(index, i + 1));
                dfs(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        pallindromePartioning pallindrome = new pallindromePartioning();
        String s = "aab";
        List<List<String>> result = pallindrome.partition(s);
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}