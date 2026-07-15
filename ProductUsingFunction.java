import java.util.*;

public class ProductUsingFunction {
    public static int product(int a,int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int product = product(num1, num2);
        System.out.println("Result: " + product);
        in.close();
    }
} 