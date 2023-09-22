package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        System.out.println(firstTerm); // Print the first term

        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(secondTerm); // Print the current term
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }}