
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 


public class WriteCSV {
    public static void main(String[] args) {
        String path = "C:\\Users\\Dell\\OneDrive\\Documents\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\csv-file-handling\\WriteCSV\\Student.csv";
        try(BufferedWriter wr = new BufferedWriter(new FileWriter(path))){
            wr.write("ID,Name,Department,Salary\n");
            wr.write("104,Abhishek,Finance,62000\n");
            wr.write("105,Amit,HR,59000\n");
            wr.write("106,Sumit,IT,72000\n");
            


        }catch(IOException e){
            e.printStackTrace();

        }
    }
}
