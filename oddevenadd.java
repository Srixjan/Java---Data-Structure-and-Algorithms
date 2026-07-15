import java.util.*;

public class oddevenadd {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "." + "Enter the number: ");
            n = in.nextInt();
            if (n % 2 == 0) {
                even = even + n;
            }
            if (n % 2 != 0) {
                odd = odd + n;
            }
        }
        System.out.println(even);
        System.out.println(odd);
        in.close();
    }
}