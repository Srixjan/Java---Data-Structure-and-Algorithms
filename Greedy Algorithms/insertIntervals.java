import java.util.ArrayList;
import java.util.List;

public class insertIntervals {
    public int[][] insertNewInterval(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        res.add(newInterval);
        while(i < n) {
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        insertIntervals insert = new insertIntervals();
        int[][] intervals = {{1, 2}, {3, 4}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {5, 8};
        
        System.out.print("Intervals Array: ");
        for (int[] interval : intervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "], ");
        }
        System.out.println();
        
        System.out.print("New Interval to be Inserted: ");
        System.out.println("[" + newInterval[0] + ", " + newInterval[1] + "]");
        
        int[][] result = insert.insertNewInterval(intervals, newInterval);
        System.out.print("Resulting Intervals after Insertion: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "], ");
        }
        System.out.println();
    }
}
