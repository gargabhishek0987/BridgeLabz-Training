import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    private static final String LINK_PATTERN = "https?://[^\\s]+";
    
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Pattern pattern = Pattern.compile(LINK_PATTERN);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            String link = matcher.group();
            link = link.replaceAll("[.,;:!?]$", "");
            links.add(link);
        }
        
        return links;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter text to extract links from:");
        
        String input = sc.nextLine();
        List<String> links = extractLinks(input);
        
        System.out.println("Extracted links:");
        if (links.isEmpty()) {
            System.out.println("No links found.");
        } else {
            for (String link : links) {
                System.out.println(link);
            }
        }
        
       
    }
}