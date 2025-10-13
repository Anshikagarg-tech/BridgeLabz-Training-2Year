import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Emergency", "Patient in ICU needs attention!"),
            new Alert("Reminder", "Medication due at 6 PM."),
            new Alert("Update", "System maintenance scheduled tonight."),
            new Alert("Emergency", "Code Blue in Ward 5!")
        );

        // Predicate to show only emergency alerts
        Predicate<Alert> isEmergency = a -> a.type.equalsIgnoreCase("Emergency");

        // Filter and display
        System.out.println("Emergency Alerts:");
        alerts.stream()
              .filter(isEmergency)
              .forEach(System.out::println);
    }
}
