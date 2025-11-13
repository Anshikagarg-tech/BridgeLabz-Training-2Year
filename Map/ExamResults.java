import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();

        // Subject-wise data
        Map<String, Integer> math = new HashMap<>();
        math.put("Aman", 85);
        math.put("Riya", 92);
        math.put("Dev", 76);

        Map<String, Integer> sci = new HashMap<>();
        sci.put("Aman", 90);
        sci.put("Riya", 88);
        sci.put("Dev", 95);

        results.put("Math", math);
        results.put("Science", sci);

        for (String subject : results.keySet()) {
            Map<String, Integer> marks = results.get(subject);
            int total = 0, max = 0;
            String topper = "";

            for (String student : marks.keySet()) {
                int score = marks.get(student);
                total += score;
                if (score > max) {
                    max = score;
                    topper = student;
                }
            }

            System.out.println(subject + " Topper: " + topper + " (" + max + ")");
            System.out.println("Average: " + (total / marks.size()));
        }

        System.out.println("\nSubjects with ≥90 scorer:");
        for (String subject : results.keySet()) {
            for (int score : results.get(subject).values()) {
                if (score >= 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }
}
