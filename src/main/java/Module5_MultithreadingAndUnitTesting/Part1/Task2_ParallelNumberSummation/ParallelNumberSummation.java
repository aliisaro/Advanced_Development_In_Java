package Module5_MultithreadingAndUnitTesting.Part1.Task2_ParallelNumberSummation;

import java.util.Scanner;

public class ParallelNumberSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number of the range: ");
        int end = scanner.nextInt();

        scanner.close();

        // Calculate the midpoint of the range
        int midpoint = (start + end) / 2;

        // Create the threads
        NumberSumWorker worker1 = new NumberSumWorker(start, midpoint);
        NumberSumWorker worker2 = new NumberSumWorker(midpoint + 1, end);

        // Start both threads simultaneously
        worker1.start();
        worker2.start();

        // Wait for both threads to finish
        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of worker 1: " + worker1.getSum());
        System.out.println("Sum of worker 2: " + worker2.getSum());
    }
}
