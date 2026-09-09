package Statistics;

import java.util.Arrays;

public class Stats {

    // Calculate Mean
    public static double mean(double[] data) {
        double sum = 0;

        for (double value : data) {
            sum += value;
        }

        return sum / data.length;
    }

    // Calculate Median
    public static double median(double[] data) {
        double[] sortedData = data.clone();
        Arrays.sort(sortedData);

        int n = sortedData.length;

        if (n % 2 == 0) {
            return (sortedData[n / 2 - 1] + sortedData[n / 2]) / 2;
        } else {
            return sortedData[n / 2];
        }
    }

    // Calculate Standard Deviation
    public static double standardDeviation(double[] data) {
        double mean = mean(data);
        double sum = 0;

        for (double value : data) {
            sum += Math.pow(value - mean, 2);
        }

        return Math.sqrt(sum / data.length);
    }
}
