import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class SearchRecord {
    public static void main(String[] args) {
        String path = "io-programming-practice\\gcr-codebase\\csv-file-handling\\searchRecord\\employees.csv";
        String line;
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine().trim();
        boolean found  = false;

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine();

            while((line =br.readLine()) !=null){
                if(line.trim().isEmpty()) continue;

                String[] col = line.split(",");

                if(col[1].equalsIgnoreCase(search)){
                    System.out.println("Record found "+ col[1].trim());
                    System.out.println("Department "+ col[2].trim());
                    System.out.println("Salary "+ col[3].trim());
                    found = true; 
                }
                }  if(!found){
                    System.out.println("Record not found");

            }
            
        }catch(IOException e){
            e.printStackTrace();
    }
}
}