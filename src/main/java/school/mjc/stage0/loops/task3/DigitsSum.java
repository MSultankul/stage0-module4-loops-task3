package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        // Convert the number to a string
        String numString = "" + number;

        // Initialize sum to 0
        int sum = 0;

        // Iterate through the characters in the string
        for (int i = 0; i < numString.length(); i++) {
            // Convert the character back to an integer and add it to the sum
            sum += Integer.parseInt("" + numString.charAt(i));
        }

        // Print the sum
        System.out.println(sum);
    }}

