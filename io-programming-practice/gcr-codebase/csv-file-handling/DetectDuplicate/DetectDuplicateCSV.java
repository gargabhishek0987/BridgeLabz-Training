import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("io-programming-practice\\gcr-codebase\\csv-file-handling\\DetectDuplicate\\employees.csv"));
        Set<String> Id = new HashSet<>();

        String line;
        br.readLine(); 

        System.out.println("Duplicate Records:");

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");
            String id = data[0];

            if (!Id.add(id)) {
                System.out.println(line);
            }
        }

    }
}
