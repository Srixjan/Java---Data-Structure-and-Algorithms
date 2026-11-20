import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nMeetingsInRoom {
    static class MeetingComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[1], b[1]);
        }
    }

    public int maxMeetings(int[] start, int[] end) {
        int n = start.length;
        List<int[]> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            meetings.add(new int[]{start[i], end[i]});
        }

        Collections.sort(meetings, new MeetingComparator());

        int limit = meetings.get(0)[1];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (meetings.get(i)[0] > limit) {
                limit = meetings.get(i)[1];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        nnMeetingsInRoom meet = new nMeetingsInRoom();
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int maxMeetings = meet.maxMeetings(start, end);
        System.out.println("Maximum number of meetings: " + maxMeetings);
    }
}
