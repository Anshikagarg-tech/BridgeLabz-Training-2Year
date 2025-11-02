import java.util.*;

public class ProductRatings {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, null, 4, 2));

        ArrayList<Integer> combined = new ArrayList<>();

        for(int r : arr1) combined.add(r); // auto-boxing
        for(Integer r : arr2) if(r != null) combined.add(r);

        int sum = 0;
        for(int r : combined) sum += r;

        double avg = (double) sum / combined.size();
        System.out.println("Combined Ratings: " + combined);
        System.out.println("Average Rating: " + avg);
    }
}
