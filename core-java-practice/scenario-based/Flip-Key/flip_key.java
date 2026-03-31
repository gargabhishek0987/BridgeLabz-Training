// package scenariobased.core_programming.flip_key_logical_problem;

import java.util.Scanner;

public class flip_key {

    public static String CleanseAndInvert(String input) {
        if (input == null || input.length() < 6) {
            return "";
        }

        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return "";
            }
        }

        input = input.toLowerCase();

        StringBuilder filtered = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch % 2 != 0) {   
                filtered.append(ch);
            }
        }


        filtered.reverse();

        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = CleanseAndInvert(input);

        if (result.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is: " + result);
        }
    }
}