import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BadWordCensor {

    private static final List<String> BAD_WORDS = Arrays.asList("damn", "stupid", "fool", "idiot");

    public static String censor(String text) {
        String result = text;

        for (int i = 0; i < BAD_WORDS.size(); i++) {
            String badWord = BAD_WORDS.get(i);
            String regex = "\\b" + Pattern.quote(badWord) + "\\b";
            result = Pattern.compile(regex, Pattern.CASE_INSENSITIVE)
                            .matcher(result)
                            .replaceAll("****");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text");
        String input = sc.nextLine();

        String censored = censor(input);

        System.out.println("Original " + input);
        System.out.println("Censored " + censored);

       

    }
}