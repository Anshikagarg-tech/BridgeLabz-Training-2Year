package program.ride_hailing;

public class CarRide extends VehicleRide implements GPS {
    private String currentLocation;

    public CarRide(String id, String driver, double rate) {
        super(id, driver, rate);
        this.currentLocation = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}
