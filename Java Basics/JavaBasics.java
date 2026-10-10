import java.util.*;
public class JavaBasics {
    
    public static int multiply(int a, int b) {
        int sum = a * b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        int sum = multiply(a, b);
        System.out.println("Output: " + sum);
        in.close();
    }
}