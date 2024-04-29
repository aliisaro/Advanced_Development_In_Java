package Module5_MultithreadingAndUnitTesting.Part1.Task1_MultithreadedNumbers;

public class OddNumberThread extends Thread {
    private int max;
    public OddNumberThread(int max) {
        this.max = max;
    }
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            System.out.println("Odd thread: " + i);
            try {
                Thread.sleep(100); // Optional: Adds a delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
