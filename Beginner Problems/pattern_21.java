public class pattern_21 {
    public void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern_21 patt = new pattern_21();
        patt.pattern21(N);
    }
}
