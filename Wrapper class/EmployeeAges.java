import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 32, 28, 45, 19, 30};
        ArrayList<Integer> list = new ArrayList<>();

        for(int age : ages) {
            list.add(age); // auto-boxing
        }

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Ages: " + list);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
