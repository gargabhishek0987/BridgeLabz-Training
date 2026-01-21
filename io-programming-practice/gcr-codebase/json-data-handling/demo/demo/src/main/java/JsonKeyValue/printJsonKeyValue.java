import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONObject;

public class printJsonKeyValue {
    public static void main(String[] args) throws Exception {

        String path = "data.json";

        String file1 = new String(Files.readAllBytes(Paths.get(path)));

        JSONObject jsonObject = new JSONObject(file1);

        Iterator<String> keys = jsonObject.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
