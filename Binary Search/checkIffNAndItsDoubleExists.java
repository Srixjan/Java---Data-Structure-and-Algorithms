import java.util.Arrays;

public class checkIffNAndItsDoubleExists {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int targetIdx = binarySearch(2 * arr[i], arr);
            if (targetIdx != -1 && targetIdx != i) {
                return true;
            }
        }
        return false;
    }

    private int binarySearch(int num, int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 1, 3};
        checkIffNAndItsDoubleExists check = new checkIffNAndItsDoubleExists();
        System.out.print("the number and its double is "+check.checkIfExist(arr));
    }
}
