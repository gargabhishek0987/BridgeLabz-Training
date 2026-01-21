
import org.json.JSONArray;
import org.json.JSONObject;

public class jsonObject {
    public static void main(String[] args) {

        JSONObject student = new JSONObject();

        student.put("name", "Rahul");
        student.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Science");
        subjects.put("English");

        student.put("subjects", subjects);

        System.out.println(student.toString(4)); 
    }
}


