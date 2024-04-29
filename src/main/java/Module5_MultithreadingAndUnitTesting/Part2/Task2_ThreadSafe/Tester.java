package Module5_MultithreadingAndUnitTesting.Part2.Task2_ThreadSafe;

public class Tester {
    public static void main(String[] args) {
        ThreadSafeArray safeArray = new ThreadSafeArray();

        // Create and start threads
        FirstThread thread1 = new FirstThread(safeArray);
        SecondThread thread2 = new SecondThread(safeArray);
        thread1.start();
        thread2.start();
    }
}