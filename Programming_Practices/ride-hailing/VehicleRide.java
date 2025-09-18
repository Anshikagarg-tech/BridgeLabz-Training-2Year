package program.ride_hailing;

public abstract class VehicleRide {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("VehicleID: " + vehicleId + " | Driver: " + driverName + " | Rate/km: " + ratePerKm);
    }
}
