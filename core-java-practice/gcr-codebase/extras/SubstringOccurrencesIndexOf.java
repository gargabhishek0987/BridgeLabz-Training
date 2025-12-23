import java.util.Scanner;

public class SubstringOccurrencesIndexOf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + 1; 
        }

        System.out.println("Number of occurrences: " + count);
    }
}
