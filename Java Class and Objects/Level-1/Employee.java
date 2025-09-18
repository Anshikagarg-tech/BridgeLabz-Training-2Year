package program.basics;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rohit", 101, 50000);
        Employee e2 = new Employee("Anshika", 102, 60000);

        e1.displayDetails();
        e2.displayDetails();
    }
}
