public class checkifArraySorted {
    boolean arraySortedOrNot(int[] arr, int n) {
        // int box = 0;
        for (int i = n-1; i > 0; i--) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;

        checkifArraySorted sort = new checkifArraySorted();
        System.out.print(sort.arraySortedOrNot(arr, l));

    }
}