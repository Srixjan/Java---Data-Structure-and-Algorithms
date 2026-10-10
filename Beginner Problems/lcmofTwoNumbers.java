public class lcmofTwoNumbers {
    public int LCM(int n1, int n2) {
        int lcm = 0;
        int i = 1;
        int n = Math.max(n1, n2);
        while(true) {
            int mul = n * i;
            if (mul % n1 == 0 && mul % n2 == 0) {
                lcm = mul;
                break;
            }
            i++;
        }
        return lcm;
    }    

    public static void main(String[] args) {
        int l1 = 4,  l2 = 6;
        lcmofTwoNumbers lcm = new lcmofTwoNumbers();
        int ans = lcm.LCM(l1, l2);
        System.out.print(ans);
    }
}
