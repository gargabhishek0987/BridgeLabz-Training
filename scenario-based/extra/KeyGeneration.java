package practice.prep;

import java.util.Scanner;

public class KeyGeneration {
    public static void keyGeneration(String s) {

        String ar = "";

        if(s.isEmpty()){
            System.out.println("Invalid Input (empty string)");
        }
        else if(s.matches(".*\\s.*")){
            System.out.println("Invalid Input (contains space)");
        }
        else if(s.matches(".*\\d.*")){
            System.out.println("Invalid Input (contains digits)");
        }
        else if(!s.matches("[a-zA-Z0-9]+")){
            System.out.println("Invalid Input (contains special character)");
        }

        else if(s.length() < 6){
            System.out.println("Invalid Input (length < 6)");
        }

        else {
            s = s.toLowerCase();
            for(int i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                int ascii = (int) ch;
                if(ascii % 2 != 0){
                    ar = ar + ch;
                }
            }

        String rv = "";
        for(int i = ar.length()-1; i >= 0; i--){
            rv = rv + ar.charAt(i);
        }

        String finalR ="";
        for(int i = 0 ; i < rv.length(); i++){
                if(i % 2 == 0){
                    finalR = finalR + (char)(rv.charAt(i) - 32);
                }
                else {

                    finalR = finalR + rv.charAt(i);
                }
        }
        System.out.println("The generated key is - "+finalR);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        while(length-- > 0){
            String s = sc.nextLine();
            keyGeneration(s);
        }
    }
}
