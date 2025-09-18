package program.vehicle_rental;

public abstract class Vehicle {
    private String brand;
    private String model;
    private double baseRate; // per day

    public Vehicle(String brand, String model, double baseRate) {
        this.brand = brand;
        this.model = model;
        this.baseRate = baseRate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return brand + " " + model + " | Rate: ₹" + baseRate + "/day";
    }
}
