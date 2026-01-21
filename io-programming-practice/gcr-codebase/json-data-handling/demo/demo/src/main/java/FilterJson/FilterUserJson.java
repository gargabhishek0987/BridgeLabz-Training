import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUserJson {
    public static void main(String[] args) throws Exception {

        String file2 = new String(Files.readAllBytes(Paths.get("users.json")));
        JSONArray users = new JSONArray(file2);

        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);

            int age = user.getInt("age");

            if (age > 25) {
                System.out.println(
                    "Name: " + user.getString("name") + " Age: " + age + " Email: " + user.getString("email")
                );
            }
        }
    }
}
