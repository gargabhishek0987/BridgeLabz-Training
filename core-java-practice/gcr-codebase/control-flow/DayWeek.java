import java.util.Scanner;
class DayWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;

        int dayOfWeek = (d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        System.out.println("Day of week is: " + dayOfWeek);
    }
}