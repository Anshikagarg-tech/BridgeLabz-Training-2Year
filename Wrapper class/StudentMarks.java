import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        String inputs[] = {"85", "95", "null", "88", "abc", "77"};

        ArrayList<Integer> marks = new ArrayList<>();

        for(String s : inputs) {
            try {
                marks.add(Integer.valueOf(s));
            } catch(Exception e) {
                // ignore invalid
            }
        }

        int sum = 0;
        for(int m : marks) sum += m;

        double avg = (double)sum / marks.size();
        System.out.println("Valid Marks: " + marks);
        System.out.println("Average Marks: " + avg);
    }
}
