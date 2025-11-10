import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "null", "abc", "88"};

        ArrayList<Integer> marks = new ArrayList<>();

        for (String val : inputs) {
            try {
                marks.add(Integer.parseInt(val));
            } catch (Exception ignored) {}
        }

        int sum = 0;
        for (int m : marks) sum += m;

        System.out.println("Average = " + (double)sum / marks.size());
    }
}
