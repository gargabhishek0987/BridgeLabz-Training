import java.util.Scanner;

public class LexicalTwist {

    // 1. Check if word is valid (no spaces)
    public static boolean isValidWord(String word) {
        return !word.contains(" ");
    }

    // 2. Check if second word is reverse of first (case insensitive)
    public static boolean isReverse(String first, String second) {
        String reversed = new StringBuilder(first).reverse().toString();
        return reversed.equalsIgnoreCase(second);
    }

    // 3. Reverse word and convert to lowercase
    public static String reverseAndLowercase(String word) {
        return new StringBuilder(word).reverse().toString().toLowerCase();
    }

    // 4. Replace vowels with '@'
    public static String replaceVowelsWithAt(String word) {
        return word.replaceAll("[aeiou]", "@");
    }

    // 5. Combine words and convert to uppercase
    public static String combineAndUppercase(String word1, String word2) {
        return (word1 + word2).toUpperCase();
    }

    // 6. Check if character is vowel
    public static boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    // 7. Count vowels
    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 8. Count consonants
    public static int countConsonants(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!isVowel(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 9. Get first two unique vowels
    public static String getFirstTwoVowels(String word) {
        String result = "";
        for (int i = 0; i < word.length() && result.length() < 2; i++) {
            char ch = word.charAt(i);
            if (isVowel(ch) && result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }

    // 10. Get first two unique consonants
    public static String getFirstTwoConsonants(String word) {
        String result = "";
        for (int i = 0; i < word.length() && result.length() < 2; i++) {
            char ch = word.charAt(i);
            if (!isVowel(ch) && result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String firstWord = sc.nextLine();

        if (!isValidWord(firstWord)) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String secondWord = sc.nextLine();

        if (!isValidWord(secondWord)) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        // Case 1: Second word is reverse of first
        if (isReverse(firstWord, secondWord)) {

            String reversed = reverseAndLowercase(firstWord);
            String finalResult = replaceVowelsWithAt(reversed);
            System.out.println(finalResult);

        }
        // Case 2: Second word is NOT reverse
        else {

            String combined = combineAndUppercase(firstWord, secondWord);

            int vowelCount = countVowels(combined);
            int consonantCount = countConsonants(combined);

            if (vowelCount > consonantCount) {
                System.out.println(getFirstTwoVowels(combined));
            } else if (consonantCount > vowelCount) {
                System.out.println(getFirstTwoConsonants(combined));
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

    
    }
}
