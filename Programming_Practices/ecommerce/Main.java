import java.util.ArrayList;
import java.util.List;

public class Main {
    // Method to calculate final price for any Product
    public static void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0.0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double finalPrice = product.getPrice() + tax - discount;
        product.displayProduct();
        System.out.printf("Final Price: %.2f%n", finalPrice);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("E101", "Laptop", 60000, 2));
        products.add(new Clothing("C202", "T-Shirt", 1500, "M"));
        products.add(new Groceries("G303", "Rice", 2000, 10));

        for (Product p : products) {
            printFinalPrice(p); // Polymorphism: works with all product types
        }
    }
}
