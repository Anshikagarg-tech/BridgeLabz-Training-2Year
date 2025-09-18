package program.food_delivery;

public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
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
