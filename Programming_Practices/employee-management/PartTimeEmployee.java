public class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(String id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department == null ? "Not assigned" : department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: PartTime | Hours: " + hoursWorked + " | Department: " + getDepartmentDetails());
    }
}
