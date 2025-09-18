public class FullTimeEmployee extends Employee implements Department {
    private double monthlyAllowance;
    private String department;

    public FullTimeEmployee(String id, String name, double baseSalary, double monthlyAllowance) {
        super(id, name, baseSalary);
        this.monthlyAllowance = monthlyAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyAllowance;
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
        System.out.println("Type: FullTime | Department: " + getDepartmentDetails());
    }
}
