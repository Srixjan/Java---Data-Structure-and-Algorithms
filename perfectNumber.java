public class perfectNumber {
    public boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }
        
        if (sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int N = 10;
        perfectNumber pn = new perfectNumber();
        System.out.print(N+ " is "+pn.isPerfect(N)+"ly, a Perfect Number.");
    }
}
