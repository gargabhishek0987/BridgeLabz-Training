import java.util.Scanner;

public class IllegalArgumentExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

  
        try {
            String result = text.substring(5, 2); 
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
        }
     

    }
}
