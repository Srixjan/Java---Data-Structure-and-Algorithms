public class findSquareRootOfANumber {
    public int floorSqrt(int n) {
        int low = 1, high = n;
      while (low <= high) {
        int mid = low + (high - low) / 2;
        long val = (long) mid * (long) mid;
        if (val <= (long) n) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
      }
      return high;
    }

    public static void main(String[] args) {
        int n = 28;
        
        findSquareRootOfANumber squareroot = new findSquareRootOfANumber();
        
        int ans = squareroot.floorSqrt(n);
        
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
