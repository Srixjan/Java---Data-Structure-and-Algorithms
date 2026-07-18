class pattern_15 {
    public void pattern15(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern_15 pat15 = new pattern_15();
        pat15.pattern15(N);
    }
}