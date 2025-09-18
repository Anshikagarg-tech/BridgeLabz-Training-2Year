package program.food_delivery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem veg1 = new VegItem("Paneer Pizza", 200, 2);
        veg1.applyDiscount(50);

        NonVegItem nonVeg1 = new NonVegItem("Chicken Burger", 150, 3);
        nonVeg1.applyDiscount(30);

        order.add(veg1);
        order.add(nonVeg1);

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Discount: " + ((Discountable)item).getDiscountDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("----------------------");
        }
    }
}
