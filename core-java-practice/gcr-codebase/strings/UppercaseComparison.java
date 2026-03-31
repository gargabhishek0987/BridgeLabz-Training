import java.util.Scanner;

public class UppercaseComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String custom = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);
            custom += ch;
        }
        String built = text.toUpperCase();
        boolean same = true;
        if (custom.length() != built.length())
            same = false;
        else {
            for (int i = 0; i < custom.length(); i++) {
                if (custom.charAt(i) != built.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println("Custom Uppercase : " + custom);
        System.out.println("Built-in Uppercase : " + built);
        System.out.println("Do both match? " + same);
    }
}
