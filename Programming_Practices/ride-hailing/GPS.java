package program.ride_hailing;

public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
