import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecord {
    public static void main(String[] args) {
        String path = "io-programming-practice\\gcr-codebase\\csv-file-handling\\filterRecords\\Students.csv";

        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine();

            while((line = br.readLine()) !=null){
                String[] column = line.split(",");
                int marks =Integer.parseInt(column[3]);
                if(marks > 80 ){
                    System.out.println(marks);

                }
            }


        }catch(IOException e){
            e.printStackTrace();
    
    }
    
}
}