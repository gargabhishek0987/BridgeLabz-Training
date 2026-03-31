import java.util.Scanner;
public class LongestWordSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");
        String Longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > Longest.length()) {
                Longest = words[i];

            }
        }
        System.out.println(Longest);
        
    }}
    

