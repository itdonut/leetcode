public class Task_643 {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            int end = i + k;
            int avg = 0;
            for (int j = i; j < end; j++) {
                avg += nums[j];
            }
            if (avg > maxAvg) maxAvg = avg;
        }
        return maxAvg / k;
    }
}
