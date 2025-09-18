package program.ride_hailing;

public class BikeRide extends VehicleRide implements GPS {
    private String currentLocation;

    public BikeRide(String id, String driver, double rate) {
        super(id, driver, rate);
        this.currentLocation = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // 20% cheaper
    }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { currentLocation = newLocation; }
}
