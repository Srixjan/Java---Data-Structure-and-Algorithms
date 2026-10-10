import java.util.*;

public class loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number->");
        int n = sc.nextInt();
        int i = 0;
        int s = 0;
        while (i <= n) {
             s = s + i;
            System.out.println(s);
            i++;
        }
        sc.close();

    }
}