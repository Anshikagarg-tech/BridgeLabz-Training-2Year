// Interface
interface Worker {
    void performDuties();
}

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPerson() {
        System.out.println("Name: " + name + " | ID: " + id);
    }
}

// Subclass - Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious " + specialty + " dishes.");
    }
}

// Subclass - Waiter
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tablesAssigned + " tables.");
    }
}

// Demo class
public class RestaurantDemo {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Rahul", 101, "Italian");
        Waiter waiter1 = new Waiter("Sita", 202, 5);

        chef1.displayPerson();
        chef1.performDuties();
        System.out.println("------------------");

        waiter1.displayPerson();
        waiter1.performDuties();
    }
}
