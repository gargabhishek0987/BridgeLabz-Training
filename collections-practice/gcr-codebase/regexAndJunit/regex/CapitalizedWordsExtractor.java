import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {
    private static final String CAPITALIZED_WORD_PATTERN = "\\b[A-Z][a-zA-Z]*\\b";
    
    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile(CAPITALIZED_WORD_PATTERN);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            words.add(matcher.group());
        }
        
        return words;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter text to extract capitalized words from");
        
        String input = sc.nextLine();
        List<String> words = extractCapitalizedWords(input);
        
        if (words.isEmpty()) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println(String.join(", ", words));
        }
        
        String exampleText = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println("Input" + exampleText);
        System.out.println("Output");
        List<String> exampleWords = extractCapitalizedWords(exampleText);
        System.out.println(String.join(", ", exampleWords));
        
    }
}