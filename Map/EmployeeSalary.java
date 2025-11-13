import java.util.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        Map<String, Double> salary = new HashMap<>();
        salary.put("Aman", 50000.0);
        salary.put("Riya", 60000.0);
        salary.put("Dev", 55000.0);
        salary.put("Sana", 65000.0);
        salary.put("Arjun", 52000.0);
        salary.put("Kiran", 70000.0);

        // Raise
        String name = "Riya";
        if (salary.containsKey(name))
            salary.put(name, salary.get(name) * 1.10);
        else
            System.out.println("Employee not found");

        // Average
        double total = 0;
        for (double s : salary.values()) total += s;
        double avg = total / salary.size();
        System.out.println("Average Salary: " + avg);

        // Highest
        double max = Collections.max(salary.values());
        System.out.println("\nHighest Paid:");
        for (String e : salary.keySet())
            if (salary.get(e) == max)
                System.out.println(e + " -> " + max);
    }
}
