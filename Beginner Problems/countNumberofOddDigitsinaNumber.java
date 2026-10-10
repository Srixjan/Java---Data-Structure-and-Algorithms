public class countNumberofOddDigitsinaNumber {
    public int digits(int n){
        int oddDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0) {
                oddDigits++;
            }
            n = n / 10;
        }
        return oddDigits;
    }

    public static void main(String[] args){
        int N = 15;
        countNumberofOddDigitsinaNumber od = new countNumberofOddDigitsinaNumber();
        int ans = od.digits(N);
        System.out.println(ans);
    }
}