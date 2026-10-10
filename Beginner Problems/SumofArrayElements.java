public class SumofArrayElements {
    public int sum(int[] arr, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] N = {1, 2, 3, 4, 5};
        int a = 5;
        SumofArrayElements sum = new SumofArrayElements();
        int result = sum.sum(N, a);
        System.out.print(result);
        
    }
}
