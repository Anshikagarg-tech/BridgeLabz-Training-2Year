import java.util.*;

public class ProductRatings {
    public static void main(String[] args) {
        int[] oldRatings = {5, 4, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 2));

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int r : oldRatings) allRatings.add(r); // auto-boxing
        allRatings.addAll(newRatings);

        int sum = 0, count = 0;
        for (Integer r : allRatings) {
            if (r != null) { // ignore null (wrapper advantage)
                sum += r; // auto-unboxing
                count++;
            }
        }

        System.out.println("Average Rating = " + (double)sum / count);
    }
}
