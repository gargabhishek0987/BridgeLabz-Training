import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ValidateCSV {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("io-programming-practice\\gcr-codebase\\csv-file-handling\\validateCSV\\users.csv"));
        String line;

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegec = "\\d{10}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegec);


        br.readLine();
        while((line = br.readLine()) !=null){
            String[] data = line.split(",");

            String email = data[2];
            String phone = data[3];

            boolean emailValid = emailPattern.matcher(email).matches();
            boolean phoneValid = phonePattern.matcher(phone).matches();

            if(!emailValid || !phoneValid){
                System.out.println("Invalid Row "+line);

                
            }


           

        }
    
    }

    
}
