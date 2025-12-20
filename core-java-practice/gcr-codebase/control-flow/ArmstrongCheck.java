import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += digit * digit * digit;    
            originalNum /= 10;            
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

    }
}