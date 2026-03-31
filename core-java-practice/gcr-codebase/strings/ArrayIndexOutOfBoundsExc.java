import java.util.Scanner;

public class ArrayIndexOutOfBoundsExc{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Ram", "Shyam", "Amit", "Neha"};

        System.out.println("Enter index number:");
        int index = sc.nextInt();
        try {
            System.out.println("Name: " + names[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }

    }
}
