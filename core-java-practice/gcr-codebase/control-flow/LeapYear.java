import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check it is leap year or not");
        int year = sc.nextInt(); 
        //This leap year program only works for year>=1582

        if (year < 1582) {
            System.out.println("Not a   valid year");

        //the leap year is a year divisible by 4 and not 100 unless it is divisible by 400.

        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year");

        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");

        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");;

        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}