import java.util.Scanner;
class SumNaturalWhileCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int sumFormula = (n * (n + 1)) / 2;
            int suWhile = 0, i = 1;
            while (i <= n) {
                suWhile += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + suWhile);
            if (sumFormula == suWhile) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are different");
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}