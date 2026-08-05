public class factorialOfAGivenNumberRecursion {
    public long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 44;
        factorialOfAGivenNumberRecursion fact = new factorialOfAGivenNumberRecursion();
        System.out.print(fact.factorial(n));

    }
}
