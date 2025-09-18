package program.samples;

public class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id; // final
        this.name = name; // this
        this.designation = designation; // this
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rohit", "Developer");
        Employee e2 = new Employee(102, "Anshika", "Tester");

        e1.displayDetails();
        System.out.println("--------");
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
