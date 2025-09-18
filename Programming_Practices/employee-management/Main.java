import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee("F001", "Asha", 30000, 5000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee("P001", "Ravi", 5000, 60, 150);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("----------------------");
        }
    }
}
