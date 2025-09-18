package program.practice;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary());
    }
}

class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 50000);
        e1.displayEmployeeDetails();

        Manager m1 = new Manager(201, "HR", 70000);
        m1.displayManagerDetails();
    }
}
