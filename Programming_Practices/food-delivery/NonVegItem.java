package program.food_delivery;

public class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double extraChargePerItem = 50; // extra charge for non-veg

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + extraChargePerItem) * getQuantity() - discount;
    }

    @Override
    public void applyDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}
