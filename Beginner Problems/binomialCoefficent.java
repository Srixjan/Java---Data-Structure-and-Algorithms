import java.util.*;
public class binomialCoefficent {
    public static int factor(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int binCoeff(int n,int r){
        int fact_n = factor(n);
        int fact_r = factor(r);
        int nmr = factor(n-r);
        int sum = fact_n/(fact_r*nmr);
        System.out.println("result = "+ sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the n and r: ");
        int n = in.nextInt();
        int r = in.nextInt();
        binCoeff(n,r);        
        in.close();
    }
}