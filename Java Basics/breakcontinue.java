import java.util.*;
public class breakcontinue {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int n=0;
        do {
            System.out.print("Enter the number to be printed");
            n = in.nextInt();
            if(n % 10 == 0) {
               break; 
            }
            System.out.println(n);
        } while(true);
        for(int i = 0;i<=5;i++) {
            if(i == 3) {
                continue;
            }
            System.out.print(i);
        }
        do {
            System.out.print("Enter the number: ");
            n = in.nextInt();
            if(n%10 == 0) {
                continue;
            }
            System.out.println(n);
        } while(true);
    }
}