import java.util.ArrayList;
public class reverseAStringRecursion {
    private void reverse(ArrayList<Character> s, int left, int right) {
        if (left >= right) return;
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);


        reverse(s, left+1, right-1);
    }
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        reverse(s, left, right);
        return s;
    }

    public static void main(String[] args) {
        reverseAStringRecursion revrecur = new reverseAStringRecursion();
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        ArrayList<Character> reversed = revrecur.reverseString(s);
        System.out.println(reversed);
    }

}
