import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidator {

    private static final String VISA_PATTERN = "^4[0-9]{15}$";
    private static final String MASTERCARD_PATTERN = "^5[0-9]{15}$";

    public static String validateCreditCard(String cardNumber) {
        String cleanNumber = cardNumber.replaceAll("[\\s-]", "");

        if (Pattern.matches(VISA_PATTERN, cleanNumber)) {
            return "Visa Card";
        } else if (Pattern.matches(MASTERCARD_PATTERN, cleanNumber)) {
            return "MasterCard";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- Visa: Starts with 4, 16 digits");
        System.out.println("- MasterCard: Starts with 5, 16 digits");

        System.out.print("Enter credit card number: ");
        String cardNumber = sc.nextLine();

        String result = validateCreditCard(cardNumber);

        if (result.equals("Invalid")) {
            System.out.println("Invalid credit card format");
        } else {
            System.out.println("Valid " + result);
        }
        

    }
}