package Module5_MultithreadingAndUnitTesting.Part1.Task1_MultithreadedNumbers;

import java.util.Scanner;

public class Multithreaded_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number to print: ");
        int maxNumber = scanner.nextInt();

        // Create the odd and even threads
        OddNumberThread oddThread = new OddNumberThread(maxNumber);
        EvenNumberThread evenThread = new EvenNumberThread(maxNumber);

        // Start the odd thread first
        oddThread.start();

        // Wait for the odd thread to finish before starting the even thread
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the even thread
        evenThread.start();

        // Wait for the even thread to finish before printing "Printing complete."
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing complete.");
    }
}
