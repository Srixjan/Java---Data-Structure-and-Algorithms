// import java.util.*;

public class forloop {
    public static void main(String args[]) {
        int n = 12345;
        int s = 0;
        // for (int i = 1; i <= n; i++) {
        //     s = n % 10;
        //     System.out.print(s);
        //     n = n / 10;
        int i = 0;
        int rev = 0;;
        while(n > 0) {
            s = n %10;
            rev = (rev * 10) + s;
            n = n/10;
            i++;
             
        }
        System.out.println(rev);
        System.out.print(i);
        
    }
}
