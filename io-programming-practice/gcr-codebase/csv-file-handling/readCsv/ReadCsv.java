
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadCsv {
    public static void main(String[] args) {
        String path = "C:\\Users\\Dell\\OneDrive\\Documents\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-file-handling\\readCsv\\Student.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                String[] column = line.split(",");
                System.out.println("ID "+ column[0]+"Name "+column[1]);
            }
        }
        catch(IOException e){
            e.printStackTrace();
    }
    
}
}