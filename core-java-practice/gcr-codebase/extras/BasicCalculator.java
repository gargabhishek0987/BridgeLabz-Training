import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        boolean valid = true;

        System.out.println("Select operation: +, -, *, /");
        System.out.println("Enter your choice: (1-4)");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int choice = sc.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 == 0) {
                    valid = false;
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = divide(num1, num2);
                    break;

                }
            default:
                valid = false;
                System.out.println("Invalid choice.");

        }
        if (valid) {
            System.out.println(result);
        }


    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }
    
}