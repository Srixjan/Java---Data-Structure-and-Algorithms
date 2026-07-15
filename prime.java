import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        if(n<=1) {
            System.out.print(n + " is not a prime number");
        }
        for(int i = 2;i<n;){
            if(n%i == 0){
                System.out.println(n + " is not a prime number");
                break;
            }
            else {
                System.out.println(n + " is a prime number");
                break;
            }
        }
        in.close();
    }
}