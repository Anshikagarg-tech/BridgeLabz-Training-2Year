package program.samples;

public class Product {
    private static double discount = 10; // percent
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; // final
        this.productName = productName; // this
        this.price = price; // this
        this.quantity = quantity; // this
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("ProductID: " + productID + ", Name: " + productName);
            System.out.println("Price: " + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("P101", "Laptop", 50000, 2);
        p1.displayDetails();
        Product.updateDiscount(15);
        System.out.println("Updated Discount: 15%");
        p1.displayDetails();
    }
}
