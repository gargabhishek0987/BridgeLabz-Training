import java.util.Scanner;

public class WordLength2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();

        int len = 0;
        try {
            while (true) line.charAt(len++);
        } catch (Exception e) {}

        int words = 1;
        for (int i = 0; i < len; i++)
            if (line.charAt(i) == ' ') words++;

        String[][] table = new String[words][2];
        String word = "";
        int row = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || line.charAt(i) == ' ') {

                int wlen = 0;
                try {
                    while (true) word.charAt(wlen++);
                } catch (Exception e) {}

                table[row][0] = word;
                table[row][1] = String.valueOf(wlen);
                row++;
                word = "";
            } else {
                word += line.charAt(i);
            }
        }

        System.out.println("\nWord\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

    }
}
