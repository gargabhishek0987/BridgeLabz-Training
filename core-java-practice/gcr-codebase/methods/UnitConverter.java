public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 km = " + convertKmToMiles(10) + " miles");
        System.out.println("6.2 miles = " + convertMilesToKm(6.2) + " km");
        System.out.println("5 meters = " + convertMetersToFeet(5) + " feet");
        System.out.println("16.4 feet = " + convertFeetToMeters(16.4) + " meters");
    }
}