import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {
    private static final String CURRENCY_PATTERN = "\\$[0-9]+(?:\\.[0-9]{2})?|[0-9]+\\.[0-9]{2}";
    
    public static List<String> extractCurrencyValues(String text) {
        List<String> currencies = new ArrayList<>();
        Pattern pattern = Pattern.compile(CURRENCY_PATTERN);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            currencies.add(matcher.group());
        }
        
        return currencies;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        List<String> currencies = extractCurrencyValues(input);
        
        System.out.println("Extracted currency values:");
        if (currencies.isEmpty()) {
            System.out.println("No currency values found.");
        } else {
            System.out.println(String.join(", ", currencies));
        }
     
    }
}