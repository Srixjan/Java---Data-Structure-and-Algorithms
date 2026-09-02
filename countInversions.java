public class countInversions {
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n-1);
    }

    private long mergeSort(int[] arr, int low, int high) {
        long cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergeSort(arr, low, mid);
            cnt += mergeSort(arr, mid + 1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }

    private long merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int idx = 0;

        long cnt = 0;

        while(left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left++];
            } else {
                temp[idx++] = arr[right++];
                cnt += (mid - left + 1);
            }
        }

        while (left <= mid) {
            temp[idx++] = arr[left++];
        }

        while (right <= high) {
            temp[idx++] = arr[right++];
        }

        System.arraycopy(temp, 0, arr, low, high - low + 1);
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        countInversions invert = new countInversions();
        long result = invert.numberOfInversions(nums);
        System.out.print(result);
    }
}