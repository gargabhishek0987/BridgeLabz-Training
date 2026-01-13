import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateValidator {
    private static final String LICENSE_PLATE_PATTERN = "^[A-Z]{2}\\d{4}$";
    
    
    public static boolean isValidLicensePlate(String plate) {
        Pattern pattern = Pattern.compile(LICENSE_PLATE_PATTERN);
        Matcher matcher = pattern.matcher(plate);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter license plate: ");
        String plate = sc.nextLine();
        
        if (isValidLicensePlate(plate)) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate format");
        }
        
       
    }
}