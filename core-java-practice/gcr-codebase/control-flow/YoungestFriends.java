import java.util.Scanner;
class YoungestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int heightAkba = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkba, heightAnthony));
        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
    }
}