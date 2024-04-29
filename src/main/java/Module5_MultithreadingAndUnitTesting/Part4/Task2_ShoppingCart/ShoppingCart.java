package Module5_MultithreadingAndUnitTesting.Part4.Task2_ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    HashMap<String, Double> cart = new HashMap<String, Double>();

    public void addItem(String item, Double cost) {
        cart.put(item, cost);
    }

    public boolean removeItem(String item) {
        return cart.remove(item) != null;
    }

    public double totalCost() {
        double sum = 0;
        for (double cost : cart.values()) {
            sum += cost;
        }
        return sum;
    }

    public int getItemCount() {
        return cart.size();
    }
}
