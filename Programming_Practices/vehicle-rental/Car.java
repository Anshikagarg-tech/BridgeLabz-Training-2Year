package program.vehicle_rental;

public class Car extends Vehicle implements Rentable {
    private boolean luxury;

    public Car(String brand, String model, double baseRate, boolean luxury) {
        super(brand, model, baseRate);
        this.luxury = luxury;
    }

    @Override
    public double calculateRentalCost(int days) {
        double rate = getBaseRate();
        if (luxury) {
            rate += 1000; // luxury surcharge
        }
        return rate * days;
    }

    @Override
    public String toString() {
        return "Car -> " + super.toString() + (luxury ? " [Luxury]" : "");
    }
}
