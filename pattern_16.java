public class pattern_16 {
    public void patt16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern_16 pattern16 = new pattern_16();
        pattern16.patt16(N);
    }
}
