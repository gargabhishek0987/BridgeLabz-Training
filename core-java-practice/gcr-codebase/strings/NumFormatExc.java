import java.util.Scanner;

public class NumFormatExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("Enter a value:");
        String text = sc.nextLine();

        try {
            int num2 = Integer.parseInt(text);
            System.out.println("Number is: " + num2);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
        }
       
    }
}
