public class sumOfDigitsInAGivenNumber {
    public int addDigits(int num) {
        if (num <= 9) {
            return num;
        }

        int sum = sumDigit(num);
        return addDigits(sum);
    }

    private int sumDigit(int num) {
        if (num == 0) {
            return 0;
        }

        return sumDigit(num/10) + (num%10);
    }

    public static void main(String[] args) {
        int N = 510;
        sumOfDigitsInAGivenNumber sum = new sumOfDigitsInAGivenNumber();
        int ans = sum.addDigits(N);
        System.out.print(ans);
    }
}
