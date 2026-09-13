public class findTheNthRootOfANumber {
    public int NthRoot(int N, int M) {
        int low = 1, high = M;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int midN = helpFunc(mid, N, M);

            if (midN == 1) return mid;
            if (midN == 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private int helpFunc(int mid, int n, int m) {
        long ans = 1, base = mid;
        while(n > 0) {
            if (n % 2 == 1) {
                ans *= base;
                if (ans > m) return 2;
                n--;
            } else {
                n /= 2;
                base *= base;
                if (base > m) return 2;
            }
        }
        if (ans == m) return 1;
        return 0;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        findTheNthRootOfANumber Nth = new findTheNthRootOfANumber();
        int result = Nth.NthRoot(n, m);
        System.out.print(result);
    }
}
