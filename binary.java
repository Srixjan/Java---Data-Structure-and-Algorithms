public class binary {
    public static void binTodec(int n) {
        int mynum = n;
        int pow = 0;
        int decN = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            decN = decN + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            n = n/10; 
        }
        System.out.println("decimal of " + mynum +" = "+ decN);
    }

    public static void dectoBin (int n) {
        int mynum = n;
        int pow = 0;
        int binNum = 0;
        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow) );
            pow++;
            n = n/2;
        }
        System.out.println("binary form = " + mynum + " = "+ binNum);
    }
    public static void main(String args[]) {
        dectoBin(3);  
    }
}