public class countAllDigitsofANumber{
    public int countDigits(int n){
        if (n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        int N = 2;
        countAllDigitsofANumber cd = new countAllDigitsofANumber();
        int ans = cd.countDigits(N);
        System.out.println("No of digits -> "+ans);
    }
}