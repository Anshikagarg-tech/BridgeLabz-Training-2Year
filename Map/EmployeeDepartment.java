import java.util.*;

public class EmployeeDepartment {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "IT");
        empDept.put(102, "HR");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "Sales");

        // Change department
        empDept.put(102, "Admin");

        // Find all in a department
        String dept = "IT";
        System.out.println("Employees in " + dept + ":");
        for (int id : empDept.keySet())
            if (empDept.get(id).equals(dept))
                System.out.println(id);

        // Grouping
        Map<String, Integer> countDept = new HashMap<>();
        for (String d : empDept.values())
            countDept.put(d, countDept.getOrDefault(d, 0) + 1);

        System.out.println("\nTotal per department:");
        for (String d : countDept.keySet())
            System.out.println(d + " : " + countDept.get(d));
    }
}
