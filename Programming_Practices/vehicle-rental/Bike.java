package program.vehicle_rental;

public class Bike extends Vehicle implements Rentable {
    private boolean sports;

    public Bike(String brand, String model, double baseRate, boolean sports) {
        super(brand, model, baseRate);
        this.sports = sports;
    }

    @Override
    public double calculateRentalCost(int days) {
        double rate = getBaseRate();
        if (sports) {
            rate += 500; // extra charge for sports bike
        }
        return rate * days;
    }

    @Override
    public String toString() {
        return "Bike -> " + super.toString() + (sports ? " [Sports]" : "");
    }
}
