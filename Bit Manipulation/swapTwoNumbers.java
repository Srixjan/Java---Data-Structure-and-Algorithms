public class swapTwoNumbers {
    public int swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[] {a, b};
    }

    public static void main(String[] args) {
        swapTwoNumbers swapie = new swapTwoNumbers();
        int a = 5, b = 10;
        int[] swapped = swapie.swap(a, b);
        System.out.println(swapped[0] + " " + swapped[1]); // Output: 10 5
    }
}
