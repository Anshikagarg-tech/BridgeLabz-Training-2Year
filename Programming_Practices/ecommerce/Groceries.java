public class Groceries extends Product implements Taxable {
    private double weightKg;

    public Groceries(String id, String name, double price, double weightKg) {
        super(id, name, price);
        this.weightKg = weightKg;
    }

    @Override
    public double calculateDiscount() {
        // 5% discount on groceries
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        // 5% VAT
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% VAT on Groceries";
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Category: Groceries | Weight: " + weightKg + "kg | Tax: " + getTaxDetails());
    }
}
