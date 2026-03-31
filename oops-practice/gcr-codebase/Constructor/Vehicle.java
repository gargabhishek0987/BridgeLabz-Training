public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registartionFee;

    public Vehicle(String ownerName, String VehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;

    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Details: " + ownerName + vehicleType + registartionFee);
    }

    public static double updateRegistrationFee(double newFee) {
        registartionFee = newFee;
        return newFee;
    }




}
