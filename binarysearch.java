import java.util.*;

public class binarysearch {

    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the key");
        int key = sc.nextInt();

        System.out.println("Index for the key is : " + BinarySearch(numbers, key));
    }
}
