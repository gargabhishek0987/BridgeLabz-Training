import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {

    public static void main(String[] args) {

        List<String> alerts = Arrays.asList(
            "Appointment Reminder",
            "Lab Results Ready",
            "Medicine Reminder",
            "Hospital News"
        );

        Predicate<String> userPreference = alert -> alert.contains("Reminder");

        System.out.println("Filtered Alerts for User:");

        for (String alert : alerts) {
            if (userPreference.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}
