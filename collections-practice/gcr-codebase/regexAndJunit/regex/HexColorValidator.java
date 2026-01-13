import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValidator {
    private static final String HEX_COLOR_PATTERN = "^#[0-9A-Fa-f]{6}$";
    
    public static boolean isValidHexColor(String color) {
        Pattern pattern = Pattern.compile(HEX_COLOR_PATTERN);
        Matcher matcher = pattern.matcher(color);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();
        
        if (isValidHexColor(color)) {
            System.out.println("Valid hex color code");
        } else {
            System.out.println("Invalid hex color code format");
        }
        
       
    }
}