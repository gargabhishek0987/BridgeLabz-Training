import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class ReadJson {
    public static void main(String[] args) {

        String path = "io-programming-practice\\gcr-codebase\\json-data-handling\\demo\\demo\\src\\main\\java\\readJsonFile\\User.json";

        try {
            String file1 = new String(Files.readAllBytes(Paths.get(path)));

            JSONObject jsonObject = new JSONObject(file1);

            String name = jsonObject.getString("name");
            String email = jsonObject.getString("email");

            System.out.println("Name  : " + name);
            System.out.println("Email : " + email);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
