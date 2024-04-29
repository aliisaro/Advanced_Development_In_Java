package Module5_MultithreadingAndUnitTesting.Part4.Task2_ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    HashMap<String, Double> items = new HashMap<String, Double>();

    public void addItem(String item, Double cost) {
        items.put(item, cost);
    }

    public boolean removeItem(String item) {
        return items.remove(item) != null;
    }


    public static double totalCost(Map<String, Double> items) {
        double sum = 0;
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            double value = entry.getValue(); // Get the value associated with the key
            sum += value;
        }
        return sum;
    }
}
