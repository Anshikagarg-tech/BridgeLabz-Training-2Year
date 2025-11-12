import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        // Create a HashMap to store student names and grades
        Map<String, Double> grades = new HashMap<>();

        // 1️⃣ Add several students and their grades
        grades.put("Amol", 85.5);
        grades.put("Priya", 92.0);
        grades.put("Rahul", 76.5);
        grades.put("Sneha", 88.0);
        grades.put("Karan", 67.5);

        System.out.println("Initial student grades:");
        printMapSorted(grades);

        // 2️⃣ Update the grade for a student who re-took a test
        System.out.println("\nUpdating Rahul's grade to 82.0...");
        grades.put("Rahul", 82.0);

        // 3️⃣ Remove a student who dropped out
        System.out.println("Removing Karan (dropped out)...");
        grades.remove("Karan");

        // 4️⃣ Print students and grades sorted alphabetically
        System.out.println("\nFinal list of students and grades (sorted by name):");
        printMapSorted(grades);
    }

    // Method to print the map in sorted order of student names
    public static void printMapSorted(Map<String, Double> map) {
        // TreeMap automatically sorts by keys (student names)
        Map<String, Double> sorted = new TreeMap<>(map);

        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
