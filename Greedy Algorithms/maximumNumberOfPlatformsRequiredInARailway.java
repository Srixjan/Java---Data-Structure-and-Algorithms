import java.util.Arrays;

public class maximumNumberOfPlatformsRequiredInARailway {
    public int findPlatform(int[] Arrival, int[] Departure) {
        int n = Arrival.length;

        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int ans = 1;
        int count = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if(Arrival[i] <= Departure[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            ans = Math.max(ans, count);
        }
        return ans;   
    }

    public static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
 
        maximumNumberOfPlatformsRequiredInARailway maxPlatform = new maximumNumberOfPlatformsRequiredInARailway();
        System.out.println("Minimum number of Platforms required: " + maxPlatform.findPlatform(arr, dep));
    }
}
