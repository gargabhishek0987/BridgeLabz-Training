import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check if it is a leap year or not:");

        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Not a valid year");
            // check the leap year in single line of if-else statement with the help of logical operators.
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}