package program.ride_hailing;

public class Main {
    public static void main(String[] args) {
        VehicleRide car = new CarRide("C101", "Rahul", 25);
        VehicleRide bike = new BikeRide("B202", "Anita", 15);
        VehicleRide auto = new AutoRide("A303", "Sunil", 10);

        double distance = 12; // km

        System.out.println("Car Fare: ₹" + car.calculateFare(distance));
        System.out.println("Bike Fare: ₹" + bike.calculateFare(distance));
        System.out.println("Auto Fare: ₹" + auto.calculateFare(distance));
    }
}
