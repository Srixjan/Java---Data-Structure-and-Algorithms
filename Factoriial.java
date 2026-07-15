import java.util.*;
public class Factoriial {
    public static int facto (int a) {
        int f = 1;
        for(int i = 1;i<=a;i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a factorial: ");
        int a = in.nextInt();
        System.out.println(facto(a));
        in.close();
    }
    
}