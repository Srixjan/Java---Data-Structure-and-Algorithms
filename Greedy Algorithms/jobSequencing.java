import java.util.Arrays;

public class jobSequencing {
    public int[] JobScheduling(int[][] Jobs) {
        Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);
        int n = Jobs.length;

        int maxDeadline = -1;
        for (int[] it : Jobs) {
            maxDeadline = Math.max(maxDeadline, it[1]);
        }

        int[] hash = new int[maxDeadline];
        Arrays.fill(hash, -1);

        int cnt = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Jobs[i][1] - 1; j >= 0; j--) {
                if (hash[j] == -1) {
                    cnt++;
                    hash[j] = Jobs[i][0];
                    totalProfit += Jobs[i][2];

                    break;
                }
            }
        }
        return new int[]{cnt, totalProfit};
    }

     public static void main(String[] args) {
        int[][] jobs = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};

        jobSequencing job = new jobSequencing();
        int[] result = job.JobScheduling(jobs);
         System.out.println("Number of Jobs: " + result[0]);
        System.out.println("Maximum Profit: " + result[1]);
    }
}
