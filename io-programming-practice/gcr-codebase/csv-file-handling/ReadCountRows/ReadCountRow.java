import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ReadCountRow {
    public static void main(String[] args) {
        String path = "io-programming-practice\\gcr-codebase\\csv-file-handling\\ReadCountRows\\Students.csv";
        String line;
       int count =0;
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine(); 
            while((line=br.readLine()) != null){
                if(!line.trim().isEmpty()){
                    count++;
                }
            
            }
            System.out.println(count);

        }
        catch(IOException e){
            e.printStackTrace();


    }

    
}
}