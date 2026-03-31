import java.util.Scanner;
class FactorsUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find the factors of a given no. using for loop.
        int num= sc.nextInt()  ;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive number");
        }
    }
}