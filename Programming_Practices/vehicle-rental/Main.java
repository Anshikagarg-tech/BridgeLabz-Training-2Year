package program.vehicle_rental;

public class Main {
    public static void main(String[] args) {
        Rentable car = new Car("BMW", "X5", 3000, true);
        Rentable bike = new Bike("Yamaha", "R15", 1000, true);
        Rentable truck = new Truck("Tata", "LPT", 4000, 5);

        int days = 3;

        System.out.println(car.toString() + " | Cost for " + days + " days: ₹" + car.calculateRentalCost(days));
        System.out.println(bike.toString() + " | Cost for " + days + " days: ₹" + bike.calculateRentalCost(days));
        System.out.println(truck.toString() + " | Cost for " + days + " days: ₹" + truck.calculateRentalCost(days));
    }
}
