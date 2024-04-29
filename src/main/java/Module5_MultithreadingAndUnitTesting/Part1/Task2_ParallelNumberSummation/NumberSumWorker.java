package Module5_MultithreadingAndUnitTesting.Part1.Task2_ParallelNumberSummation;

public class NumberSumWorker extends Thread {
    private int start;
    private int end;
    private long sum;   //Variable to store the sum

    public NumberSumWorker(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}
