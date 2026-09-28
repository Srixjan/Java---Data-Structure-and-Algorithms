public class matrixMedian {
    private int upperBound(int[] arr, int x, int m) {
        int low = 0, high = m - 1;
        int ans = m;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } 

            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int countSmallEqual(int[][] matrix, int n, int m, int x) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            cnt += upperBound(matrix[i], x, m);
        }
        return cnt;
    }
    public int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m-1]);
        }

        int req = (m * n) / 2;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallEqual = countSmallEqual(matrix, n, m, mid);

            if (smallEqual <= req) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };

        matrixMedian mat = new matrixMedian();

        int result = mat.findMedian(matrix);
        System.out.println("The median element is: " + result);
    }
}
