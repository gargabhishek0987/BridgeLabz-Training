import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SmartCity {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

        services.forEach(TransportService::printServiceDetails);

        services.stream()
                .filter(s -> s.getFare() <= 50)
                .sorted(Comparator.comparingInt(TransportService::getDepartureTime))
                .forEach(s -> System.out.println(s.getServiceName()));

        FareCalculator calculator = distance -> distance * 10;
        double distance = GeoUtils.calculateDistance(10, 25);
        System.out.println("Fare for Taxi: " + calculator.calculateFare(distance));

        List<Double> fares = Arrays.asList(30.0, 50.0, 120.0, 30.0);

        DoubleSummaryStatistics stats =
                fares.stream().collect(Collectors.summarizingDouble(f -> f));

        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());

        System.out.println("Emergency Priority Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getServiceName() + " gets priority!"));
    }
}
