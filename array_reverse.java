import java.util.*;
public class array_reverse {

    public static void ArrayReverse (int a[]) {
        int first = 0, last = a.length-1;
        while(first < last) {
            int temp = a[first];
           a[first] = a[last];
           a[last] = temp;

           first++;
           last--;
        }

    }
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0; i <a.length; i++) {
            System.out.println("enter the "+ i + " number");
            a[i] = sc.nextInt();
        }
        System.out.println();

        ArrayReverse(a);
        for(int i = 0;i<a.length; i++) {
            System.out.println(a[i]);
        }
        sc.close();
     }
}
