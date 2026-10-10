import java.util.*;
public class function {
    public static void addi(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        addi(a, b);
    }
}  