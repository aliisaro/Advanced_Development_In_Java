package Module5_MultithreadingAndUnitTesting.Part2.Task2_ThreadSafe;

public class SecondThread extends Thread {
    private ThreadSafeArray safeArray;

    public SecondThread(ThreadSafeArray safeArray) {
        this.safeArray = safeArray;
    }

    @Override
    public void run() {
        safeArray.removeElement("Element");
        System.out.println("Removed Element by " + Thread.currentThread().getName());
    }
}
