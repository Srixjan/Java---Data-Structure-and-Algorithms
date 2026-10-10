public class pattern_18 {
    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (('A' + n - 1) -i); ch <= 'A' + n-1; ch++) {
                System.out.print(ch);    
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern_18 pat = new pattern_18();
        pat.pattern18(N);
    }
}
