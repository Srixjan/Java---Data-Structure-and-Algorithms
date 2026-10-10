public class checkPrimeRecursion {
    public boolean checkPrime(int num) {
        if(num <= 1) {
            return false;
        }

        return isPrime(num, 2);
    }

    private boolean isPrime(int num, int x) {
        if (x > Math.sqrt(num)) {
            return true;
        }

        if (num % x == 0) {
            return false;
        }

        return isPrime(num, x + 1);
    }

    public static void main(String[] args) {
        int num = 13;
        checkPrimeRecursion prime = new checkPrimeRecursion();
        boolean result = prime.checkPrime(num);
        System.out.print(result);
    }
}
