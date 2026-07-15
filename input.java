import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String intp = sc.nextLine();
        // System.out.println(intp);

        // int a = sc.nextInt();
        // System.out.println(a);
        
        // boolean b  = sc.nextBoolean();
        // System.out.println(b);

        // short s = sc.nextShort();
        // System.out.println(s);

        // long l = sc.nextLong();
        // System.out.println(l);

        // double d = sc.nextDouble();
        // System.out.println(d);


        int a = sc.nextInt();
        double b = 3.14;

        double circle = b * (a*a);
        System.out.println(circle);
        
        sc.close();
    }   
}
