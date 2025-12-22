import java.util.Scanner;

public class StringIndexOutOfBoundExc{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        try {
            char ch = text.charAt(text.length()); 
            System.out.println("Character: " + ch);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
        }


        sc.close();
    }
}
