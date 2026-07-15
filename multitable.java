import java.util.*;

public class multitable {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of the multiplication table: ");
        int n = in.nextInt();
        int multi = 0;
        int i = 0;
        for (i = 1; i <= 10; i++) {

            multi = n * i;
            System.out.println(n + " * " + i + " = " + multi);
        }
        in.close();
    }
}