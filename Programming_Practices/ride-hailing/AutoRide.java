package program.ride_hailing;

public class AutoRide extends VehicleRide implements GPS {
    private String currentLocation;

    public AutoRide(String id, String driver, double rate) {
        super(id, driver, rate);
        this.currentLocation = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% cheaper
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { currentLocation = newLocation; }
}
