package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        // Initialize variables
        long sum = 0;
        long multiplier = 9;

        // Calculate the last number in the series
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += multiplier;
            multiplier = multiplier * 10 + 9;
        }

        // Print the sum
        System.out.println(sum);
    }
}
