import java.util.Arrays;

public class nonOveraLappingIntervals {
    public int MaximumNonOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, nonOveraLappingIntervals::comp);
        int n = intervals.length;
        int cnt = 1;
        int lastEndTime = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals [i][0] >= lastEndTime) {
                cnt++;
                lastEndTime = intervals[i][1];
            }
        }
        return n-cnt;
    }

    public static int comp(int val1[], int val2[]) {
        return Integer.compare(val1[1], val2[1]);
    }

    public static void main(String[] args) {
        nonOveraLappingIntervals obj = new nonOveraLappingIntervals();
        int[][] intervals = {{0, 5}, {3, 4}, {1, 2}, {5, 9}, {7, 9}};
        
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Interval " + (i + 1) + " Start: " + intervals[i][0] + " End: " + intervals[i][1]);
        }
        
        int ans = obj.MaximumNonOverlappingIntervals(intervals);
        System.out.println("Maximum Non-Overlapping Intervals: " + ans);
    }
}
