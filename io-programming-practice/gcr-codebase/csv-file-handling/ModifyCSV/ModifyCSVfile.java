import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModifyCSVfile {
    public static void main(String[] args) {

        String path = "io-programming-practice\\gcr-codebase\\csv-file-handling\\ModifyCSV\\Employees.csv";
        String tempPath ="io-programming-practice\\gcr-codebase\\csv-file-handling\\ModifyCSV\\TempEmployee.csv";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter employee name to update salary: ");
            String searchName = sc.nextLine().trim();

            System.out.print("Enter new salary: ");
            String newSalary = sc.nextLine().trim();

            boolean found = false;

            try (BufferedReader br = new BufferedReader(new FileReader(path));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(tempPath))) {

                String line;

                line = br.readLine();
                bw.write(line);
                bw.newLine();

                while ((line = br.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;

                    String[] col = line.split(",");

                    if (col[1].trim().equalsIgnoreCase(searchName)) {
                        col[3] = newSalary;  // update salary column
                        found = true;
                    }

                    // Write modified or unchanged line to temp file
                    bw.write(String.join(",", col));
                    bw.newLine();
                }

            } catch (IOException e) {
                System.err.println("Error processing file: " + e.getMessage());
            }

            if (found) {
                File original = new File(path);
                File modified = new File(tempPath);

                if (original.delete()) {        // delete original
                    modified.renameTo(original); // rename temp file
                    System.out.println("Salary updated successfully.");
                } else {
                    System.out.println("Error updating file.");
                }
            } else {
                System.out.println("Employee not found.");
                new File(tempPath).delete();
            }
        }
    }
}
