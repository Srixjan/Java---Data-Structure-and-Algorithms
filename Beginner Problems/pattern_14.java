public class pattern_14 {
    public void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern_14 pat14 = new pattern_14();
        pat14.pattern14(N);
    }
}
