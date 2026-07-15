import java.util.*;
public class strings {
    public static void main(String args[]) {
        char arr[] = {'a','b','c','d',};
        String str = "abcd";

        Scanner sc = new Scanner(System.in);
        String nam;
        String name;
        name = sc.next(); // takes just the word.
        nam = sc.nextLine();// takes the whole sentence.
        System.out.println(nam.length());

        String Firstname = "Srijan";
        String Lastname = "Chowdhury";
        String Fullname = Firstname +" "+ Lastname; // Concatenation
        System.out.println(Fullname);

        System.out.println(Fullname.charAt(0));

    }
}
