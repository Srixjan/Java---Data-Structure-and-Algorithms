public class sumOfFirstNNumbersRecursion {
    public int nNumberSum(int N) {
        if(N == 0) return N;
        return N + nNumberSum( N - 1 );
    }    

    public static void main(String[] args) {
        sumOfFirstNNumbersRecursion sum = new sumOfFirstNNumbersRecursion();
        System.out.print(sum.nNumberSum(5));

    }
}
