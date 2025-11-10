import java.util.*;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {22, 30, 19, 45, 50};
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            ageList.add(age); // primitive → Integer (Auto-boxing)
        }

        int minAge = Collections.min(ageList);
        int maxAge = Collections.max(ageList);

        System.out.println("Age List: " + ageList);
        System.out.println("Youngest: " + minAge);
        System.out.println("Oldest: " + maxAge);
    }
}
