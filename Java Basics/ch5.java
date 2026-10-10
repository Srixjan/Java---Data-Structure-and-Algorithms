import java.util.*;
    public class ch5 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the first number: ");
            float a = sc.nextFloat();
            System.out.println("Input the second number: "); 
            float b = sc.nextFloat();
            System.out.println("Input the third number: ");
            float c = sc.nextFloat();

            float average = (a + b + c)/3;
            System.out.println (average);

            System.out.println("Enter the side: ");
            float s = sc.nextFloat();
            float area = (s * s);
            System.out.println(area);

            System.out.print("Enter the price of the pencil: ");
            float pencil = sc.nextFloat();
            System.out.print("Enter the price of the pen: ");
            float pen = sc.nextFloat();
            System.out.print("Enter the price of the eraser");
            float eraser = sc.nextFloat();

            float gst = (pencil + pen + eraser) * (18.00f/100.00f);
            float price = gst + (pencil + pen + eraser);
            System.out.println(gst);
            System.out.print(price);

            int $ = 25;
            System.out.println($);

            sc.close();
        }
    }
