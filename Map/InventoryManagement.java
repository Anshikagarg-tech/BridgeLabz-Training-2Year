import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add products
        inventory.put("Apples", 20);
        inventory.put("Bananas", 15);
        inventory.put("Oranges", 10);

        // 2. Customer buys
        String buyProduct = "Apples";
        int quantityBought = 5;
        inventory.put(buyProduct, inventory.getOrDefault(buyProduct, 0) - quantityBought);
        if (inventory.get(buyProduct) <= 0)
            inventory.put(buyProduct, 0);

        // 3. New shipment
        inventory.put("Bananas", inventory.get("Bananas") + 10);

        // 4. Query
        String query = "Oranges";
        if (inventory.containsKey(query))
            System.out.println(query + " in stock: " + inventory.get(query));
        else
            System.out.println("Not stocked");

        // Print out of stock products
        System.out.println("\nOut of Stock:");
        for (String item : inventory.keySet())
            if (inventory.get(item) == 0)
                System.out.println(item);
    }
}
