import java.util.*;

class Vehicle { String name; Vehicle(String n){ name = n; } }
class Truck extends Vehicle { Truck(String n){ super(n); } }
class Bike extends Vehicle { Bike(String n){ super(n); } }

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    void addVehicle(T v){ fleet.add(v); }
    void showFleet(){
        for(T v : fleet) System.out.println(v.name);
    }
}

class FleetTest {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck("Volvo Truck"));

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike("Yamaha"));

        trucks.showFleet();
        bikes.showFleet();
    }
}
