public class GCDofTwoNumbers {
    public int GCD(int l1, int l2) {
        int gcd = 0;
        for(int i = 1; i <= Math.min(l1, l2); i++) {
            if(l1 % i == 0 && l2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int l1 = 6, l2 = 8;
        GCDofTwoNumbers gcd = new GCDofTwoNumbers();
        int ans = gcd.GCD(l1, l2);
        System.out.print(ans);
    }
}
