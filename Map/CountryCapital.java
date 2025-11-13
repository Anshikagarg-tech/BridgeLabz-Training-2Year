import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C.");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Japan", "Tokyo");
        countries.put("Italy", "Rome");
        countries.put("Canada", "Ottawa");
        countries.put("Australia", "Canberra");

        String input = "Germany";
        System.out.println(input + " -> " + countries.getOrDefault(input, "Unknown country"));

        System.out.println("\nAll Countries:");
        for (String c : countries.keySet())
            System.out.println(c + " : " + countries.get(c));
    }
}
