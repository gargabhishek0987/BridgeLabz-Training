public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime();

    default void printServiceDetails() {
        System.out.println(
                getServiceName() + " | Route: " + getRoute() + " | Fare: " + getFare()
        );
    }
}
