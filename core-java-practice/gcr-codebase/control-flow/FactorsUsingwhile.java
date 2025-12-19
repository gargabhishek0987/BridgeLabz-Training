import java.util.Scanner;
class FactorsUsingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            int count = 1;
            while (count <= num) {
                if (num % count == 0) {
                    System.out.println(count);
                }
                count++;
            }
        } else {
            System.out.println("Enter a positive number");
        }
    }
}