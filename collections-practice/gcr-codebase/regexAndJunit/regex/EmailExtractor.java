import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        
        return emails;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Email Address Extractor ===");
        System.out.println("Enter text to extract email addresses from:");
        
        String input = sc.nextLine();
        List<String> emails = extractEmails(input);
        
        System.out.println("Extracted email addresses:");
        if (emails.isEmpty()) {
            System.out.println("No email addresses found.");
        } else {
            for (String email : emails) {
                System.out.println(email);
            }
        }
        
       
    }
}