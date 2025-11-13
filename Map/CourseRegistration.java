import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 4);
        courses.put("CS103", 60);
        courses.put("CS104", 10);
        courses.put("CS105", 2);

        // Add/Drop
        courses.put("CS102", courses.get("CS102") + 3);
        courses.put("CS105", Math.max(0, courses.get("CS105") - 1));

        System.out.println("Near Full (≥50):");
        for (String c : courses.keySet())
            if (courses.get(c) >= 50)
                System.out.println(c);

        System.out.println("\nUnder-Subscribed (<5):");
        for (String c : courses.keySet())
            if (courses.get(c) < 5)
                System.out.println(c);
    }
}
