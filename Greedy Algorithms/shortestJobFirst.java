import java.util.*;
public class shortestJobFirst {
    public long sjf(int[] bt) {
        Arrays.sort(bt);
        int n = bt.length;
        long waitTime = 0;
        long totalTime = 0;

        for (int i = 0; i < n; i++) {
            waitTime += totalTime;
            totalTime += bt[i];
        }
        return waitTime / n;
    }

    public static void main(String[] args) {
        int[] jobs = {4, 1, 3, 7, 2};
 
        System.out.print("Array Representing Job Durations: ");
        for (int job : jobs) {
            System.out.print(job + " ");
        }
        System.out.println();

        shortestJobFirst shortjob = new shortestJobFirst();
        long ans = shortjob.sjf(jobs);
        System.out.println("Total waiting time: " + ans);
    }
}

