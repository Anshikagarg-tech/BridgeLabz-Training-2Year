public class Electronics extends Product implements Taxable {
    private int warrantyYears;

    public Electronics(String id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        // 10% discount on electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 18% GST
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Category: Electronics | Warranty: " + warrantyYears + " years | Tax: " + getTaxDetails());
    }
}
