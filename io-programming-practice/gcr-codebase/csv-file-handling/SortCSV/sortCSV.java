import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortCSV {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("io-programming-practice\\gcr-codebase\\csv-file-handling\\SortCSV\\employees.csv"));
        List<String[]> list = new ArrayList<>();

        String line;
        br.readLine(); 

        while ((line = br.readLine()) != null) {
            list.add(line.split(","));
        }

        Collections.sort(list, (a, b) ->
                Integer.parseInt(b[2]) - Integer.parseInt(a[2])
        );

        System.out.println("Top 5 Highest Paid Employees:");
        for (int i = 0; i < 5 ; i++) {
            System.out.println(
                    list.get(i)[0] + " "+
                    list.get(i)[1] + " " +
                    list.get(i)[2]
            );
        }

    }
}
