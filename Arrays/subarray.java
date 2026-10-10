import java.util.*;
public class subarray {
    public static void Subarrays (int nos[]) {
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0;i<nos.length; i++) {
            int start = i;
            for(int j = i; j<nos.length; j++) {
                int end = j;
                CurrSum = 0;
                for(int k = start; k<=end; k++ ) {
                    CurrSum += nos[k];
                }
                System.out.println(CurrSum);
                if(MaxSum < CurrSum) {
                    MaxSum = CurrSum;
                } 
            }  
            
        }
        System.out.println("Max Sum = "+ MaxSum);
    }

    public static  void  MaxSubarraySum (int nos[]) {

    }
    public static void main(String args[]) {
        int nos[] = {2, 4, 6, 8, 10, 12};
        Subarrays(nos);
    }
}
