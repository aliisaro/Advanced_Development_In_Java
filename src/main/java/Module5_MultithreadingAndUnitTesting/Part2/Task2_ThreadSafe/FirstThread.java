package Module5_MultithreadingAndUnitTesting.Part2.Task2_ThreadSafe;

public class FirstThread extends Thread {
    private ThreadSafeArray safeArray;

    public FirstThread(ThreadSafeArray safeArray) {
        this.safeArray = safeArray;
    }

    @Override
    public void run() {
        safeArray.addElement("Element");
        System.out.println("Added Element by " + Thread.currentThread().getName());
    }
}
