import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        String[] students = {"Aman", "Riya", "Kiran", "Sana", "Dev"};
        for (String s : students) attendance.put(s, 0);

        Random rand = new Random();
        for (int day = 1; day <= 15; day++) {
            for (String s : students) {
                if (rand.nextBoolean()) // random attendance
                    attendance.put(s, attendance.get(s) + 1);
            }
        }

        System.out.println("Final Attendance:");
        for (String s : attendance.keySet())
            System.out.println(s + " : " + attendance.get(s));

        System.out.println("\nUnder-attending (<10 days):");
        for (String s : attendance.keySet())
            if (attendance.get(s) < 10)
                System.out.println(s);
    }
}
