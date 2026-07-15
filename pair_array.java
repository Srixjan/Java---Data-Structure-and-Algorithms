import java.util.*;
public class pair_array {

    public static void PrintPairs (int nos[]) {
        for(int i = 0; i<nos.length; i++) {
            int curr = nos[i];
            for(int j=i+1; j<nos.length; j++) {
                System.out.print("("+ curr+ ","+ nos[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int nos[] = {2, 4, 6, 8, 10};
        PrintPairs(nos);
    }
}       