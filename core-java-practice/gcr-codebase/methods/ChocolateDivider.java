import java.util.Scanner;

public class ChocolateDivider {
    public static int[] findRemaiAndQuo(int number, int divisor) {
        return new int[] { number / divisor, number % divisor };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        if (children == 0) {
            System.out.println("Number of children cannot be zero!");
            return;
        }

        int[] res = findRemaiAndQuo(chocolates, children);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}