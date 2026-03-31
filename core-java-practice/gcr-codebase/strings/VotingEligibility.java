import java.util.Random;

public class VotingEligibility{

    public static void main(String[] args) {

        int students = 10;
        int[] ages = new int[students];
        String[][] table = new String[students][2];

        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            ages[i] = rand.nextInt(90) + 10;   
            table[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                table[i][1] = "true";
            else
                table[i][1] = "false";
        }

        System.out.println("Student\tAge\tCan Vote");
        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + table[i][0] +  table[i][1]);
        }
    }
}
