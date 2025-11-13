import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1000.0);
        cart.put("Monitor", 8000.0);

        // Display order
        System.out.println("Products in cart:");
        for (String p : cart.keySet())
            System.out.println(p + " : ₹" + cart.get(p));

        // Total
        double total = 0;
        for (double price : cart.values()) total += price;
        if (total > 5000) total *= 0.9;

        System.out.println("\nTotal after discount (if applicable): ₹" + total);

        // Simulate remove
        cart.remove("Mouse");
        System.out.println("\nAfter removing an item: " + cart.keySet());
    }
}
