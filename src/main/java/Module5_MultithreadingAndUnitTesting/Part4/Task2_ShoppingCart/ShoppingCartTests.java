package Module5_MultithreadingAndUnitTesting.Part4.Task2_ShoppingCart;

import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class ShoppingCartTests {
    @Test
    public void testAddItem() {
        HashMap<String, Double> items = new HashMap<>();

        items.put("milk", 3.0);

        assertEquals(1, items.size());
        assertEquals(Double.valueOf(3.0), items.get("milk")); // Check if the value associated with the key is correct
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("milk", 3.0);

        boolean removed = cart.removeItem("milk");

        assertEquals(0, cart.items.size());
        assertTrue(removed); // Check if the item was successfully removed
    }


    @Test
    public void testTotalCost() {
        HashMap<String, Double> items = new HashMap<>();
        items.put("milk", 3.0);
        items.put("cookies", 5.0);

        double expectedTotal = 3.0 + 5.0;
        double actualTotal = ShoppingCart.totalCost(items);

        assertEquals(expectedTotal, actualTotal, 0.001); // Use delta for double comparison
    }
}
