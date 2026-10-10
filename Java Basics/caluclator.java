import java.util.*;
public class caluclator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Press 1 for addition \n Press 2 for multiplication\n Press 3 for substraction\n Press 4 for division\n And press 5 for modulus.");
        int c = in.nextInt();
        float result;
        switch(c) {
            case 1 :
            System.out.print("Input the first number: ");
            float a = in.nextFloat();
            System.out.print("Input the Second  number: ");
            float b = in.nextFloat(); 
            result = a + b;
            System.out.println(result);
            break;
            case 2 :
            System.out.print("Input the first number: ");
            float x = in.nextFloat();
            System.out.print("Input the Second  number: ");
            float y = in.nextFloat();
            result = x * y;
            System.out.println(result);
            break;
            case 3 :  
            System.out.print("Enter the bigger number: ");
            float d = in.nextFloat();
            System.out.print("Enter the smaller number: ");
            float e = in.nextFloat();
            float sub = d - e;
            System.out.println(sub);
            break;
            case 4 :
            System.out.println("Enter the dividend number: ");
            float f = in.nextFloat();
            System.out.println("Enter the divisior number: ");
            float g = in.nextFloat();
            float div = g/f;
            System.out.println(div);
            break;
            case 5 :
            System.out.println("Enter the dividend number: ");
            float h = in.nextFloat();
            System.out.println("Enter the divisior number: ");
            float i = in.nextFloat();
            float modulo = i%h;
            System.out.println(modulo);
            break;
            default :
            System.out.println("Error");
        }
        in.close();
    
    }
}
