public class armstrongNumber {
    public boolean isArmstrong(int n) {
        int count = countDigit(n);
        long sum = 0;
        int copy = n;
        while(n > 0){
            int lastdigit = n % 10;
            sum += Math.powExact(lastdigit, count);
            n = n / 10;
        }
        if (sum == copy){
            return true;
        } else return false;
    }
    public int countDigit(int n) {
        if (n == 0) return 1;
        int count = (int)(Math.log10(n)+1);
        return count;
    }

    public static void main(String[] args) {
        int n = 153;
        armstrongNumber an = new armstrongNumber();
        System.out.print("The number "+n+" is "+an.isArmstrong(n)+ " Armstrong number!");

    }
}
