import java.util.*;
public class cookies {
    public int findMaximunCookies (int[] student, int[] cookie) {
        int n = student.length;
        int m = cookie.length;

        int l = 0, r = 0;
        Arrays.sort(student);
        Arrays.sort(cookie);

        while (l < n && r < m) {
            if (cookie[r] >= student[l]) {
                l++;
            }
            r++;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] Student = {1, 2};
        int[] Cookie = {1, 2, 3};

        cookies cook = new cookies();
 
       int result = cook.findMaximunCookies(Student, Cookie);
 
        System.out.println("Number of students satisfied: " + result);
    }
}
