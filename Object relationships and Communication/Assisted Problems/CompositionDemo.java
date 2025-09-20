import java.util.ArrayList;

// Employee class
class Employee {
    String empName;

    Employee(String name) {
        this.empName = name;
    }

    void displayEmployee() {
        System.out.println("Employee: " + empName);
    }
}

// Department class (cannot exist without Company)
class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDept() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

// Company class (composition)
class Company {
    String compName;
    ArrayList<Department> departments;

    Company(String compName) {
        this.compName = compName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("\nCompany: " + compName);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        d2.addEmployee(new Employee("Charlie"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();

        // If company is deleted, departments & employees are gone too
        comp = null;
        System.gc(); // Suggest GC (not guaranteed, but shows idea of composition)
    }
}
