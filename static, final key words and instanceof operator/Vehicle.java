package program.samples;

public class Vehicle {
    private static double registrationFee = 1000;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber; // final
        this.ownerName = ownerName; // this
        this.vehicleType = vehicleType; // this
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V101", "Rohit", "Car");
        v1.displayDetails();
        Vehicle.updateRegistrationFee(1200);
        System.out.println("Updated Registration Fee: 1200");
        v1.displayDetails();
    }
}
