public class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        // 20% discount on clothing
        return getPrice() * 0.20;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Category: Clothing | Size: " + size);
    }
}
