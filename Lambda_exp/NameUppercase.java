import java.util.*;
import java.util.stream.Collectors;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Utkarshi", "Jatin", "Shekhar", "Riya");

        // Convert all names to uppercase using method reference
        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        // Print results
        upperNames.forEach(System.out::println);
    }
}
