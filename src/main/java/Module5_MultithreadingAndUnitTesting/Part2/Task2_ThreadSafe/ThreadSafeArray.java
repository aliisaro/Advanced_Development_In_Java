package Module5_MultithreadingAndUnitTesting.Part2.Task2_ThreadSafe;

import java.util.ArrayList;

public class ThreadSafeArray {
    private ArrayList<String> arrayList = new ArrayList<>();

    public synchronized void addElement(String element) {
        arrayList.add(element);
    }

    public synchronized void removeElement(String element) {
        arrayList.remove(element);
    }

    public synchronized int getSize() {
        return arrayList.size();
    }
}
