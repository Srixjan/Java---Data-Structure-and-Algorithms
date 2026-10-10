import java.util.*;
public class function_question {
    public static int average(int a, int b, int c) {
        int sum = (a + b + c)/3;
        return sum;
    }
    public static boolean IsEven (int n) {
        if(n%2 == 0) {
            return true;
        }
        return false;
    }
    public static boolean pallindrome(int p) {
        int backup = p;
        int d=0;
        int res = 0;
        while(p!=0) {
            d =  p % 10;
            res = res * 10 + d;
            p = p/10;
        }
        if(res==backup){
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the 3 nos: ");
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
        // System.out.println("Result -> " + (average(a, b, c)));
        

        // System.out.println("Check even or odd: ");
        // int n = in.nextInt();
        // System.out.println(IsEven(n));

        System.out.println("check pallindrome: ");
        int p = in.nextInt();
        System.out.println(pallindrome(p));


        in.close();
    }    
}
