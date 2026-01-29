package Utility;
import Exception.InvalidFlightException;

public class FlightUtil {
public void validateFlightName(String flightName) throws InvalidFlightException {
    if (flightName == null || flightName.trim().isEmpty()) {
        throw new InvalidFlightException("Flight name cannot be empty");
    }
    if (!flightName.matches("[A-Za-z ]+")) {
        throw new InvalidFlightException("Invalid flight name: only letters and spaces allowed");
    }
}

    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void validateFlightNumber(String flightNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void validatePassengerCount(int passengerCount, String flightName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
