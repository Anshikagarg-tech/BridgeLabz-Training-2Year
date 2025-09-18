package program.vehicle_rental;

public class Truck extends Vehicle implements Rentable {
    private int capacity; // in tons

    public Truck(String brand, String model, double baseRate, int capacity) {
        super(brand, model, baseRate);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRate() + (capacity * 100)) * days;
    }

    @Override
    public String toString() {
        return "Truck -> " + super.toString() + " | Capacity: " + capacity + " tons";
    }
}
