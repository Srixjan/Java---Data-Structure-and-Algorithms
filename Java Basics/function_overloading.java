// import java.util.*;

public class function_overloading {
    
    // function to cal sum of 2 nos
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    // function to calculate sum of 2 floating intergers
    public static float sum(float a, float b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    
    public static void main(String args[]) {
        System.out.println(sum(1, 2));
        System.out.println(sum(2.00f, 5.00f));
    }
}