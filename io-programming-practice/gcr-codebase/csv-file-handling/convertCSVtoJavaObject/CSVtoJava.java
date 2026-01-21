import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVtoJava {
    public static void main(String[] args) {

        String path = "io-programming-practice\\gcr-codebase\\csv-file-handling\\convertCSVtoJavaObject\\Strudents.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()){
                    continue;
                }

                String[] col = line.split(",");

                int id = Integer.parseInt(col[0].trim());
                String name = col[1].trim();
                int age = Integer.parseInt(col[2].trim());
                int marks = Integer.parseInt(col[3].trim());

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
