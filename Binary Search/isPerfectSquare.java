public class isPerfectSquare {
    public boolean isPerfect(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        isPerfectSquare square = new isPerfectSquare();
        System.out.println("The boolean value of your is perfect square is : "+ square.isPerfect(num));
    }
}
