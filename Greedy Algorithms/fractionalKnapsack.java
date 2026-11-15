import java.util.Arrays;

public class fractionalKnapsack {
    public double factKnack(int[] val, int[] wt, long cap) {
        int n = val.length;

    double[][] ratio = new double[n][2];
    for (int i = 0; i < n; i++) {
        ratio[i] = new double[] {(double) val[i]/wt[i], i};

    }

    Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));

    double totalValue = 0.0;
        for (double[] r : ratio) {
            int i = (int) r[1];
            if (wt[i] <= cap) {
                totalValue += val[i];
                cap -= wt[i];
            } else {
                totalValue += val[i] * ((double) cap / wt[i]);
                break;
            }
        }

        return Math.round(totalValue * 1e6) / 1e6;
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        long capacity = 50;

        fractionalKnapsack frac = new fractionalKnapsack();
        System.out.printf("%.6f", frac.factKnack(val, wt, capacity));
    }
}
