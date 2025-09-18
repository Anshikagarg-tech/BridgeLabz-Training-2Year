package program.basics;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode + ", Item Name: " + itemName + ", Price: " + price);
    }

    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 50000);
        Item i2 = new Item(102, "Mouse", 500);

        i1.displayItemDetails();
        System.out.println("Total cost for 2 laptops: " + i1.calculateTotalCost(2));

        i2.displayItemDetails();
        System.out.println("Total cost for 5 mice: " + i2.calculateTotalCost(5));
    }
}
