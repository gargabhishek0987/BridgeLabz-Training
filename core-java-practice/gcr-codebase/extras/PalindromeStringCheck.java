import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        if (str.equals(reverse)) {
            System.out.println("The string is a palindrome.");

        }
        else {
            System.out.println("The string is not a palindrome.");
        }

        
    }
    
}
