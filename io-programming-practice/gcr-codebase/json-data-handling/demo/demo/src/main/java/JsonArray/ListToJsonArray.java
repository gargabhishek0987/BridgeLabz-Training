import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ListToJsonArray {
    public static void main(String[] args) {

        List<Users> users = new ArrayList<>();
        users.add(new Users("Rahul", 22, "rahul@gmail.com"));
        users.add(new Users("Priya", 28, "priya@gmail.com"));
        users.add(new Users("Amit", 30, "amit@gmail.com"));

        JSONArray jsonArray = new JSONArray();

        for (Users user : users) {
            JSONObject jsonUser = new JSONObject(user); 
            jsonArray.put(jsonUser);
        }

        System.out.println(jsonArray.toString(4)); 
    }
}
