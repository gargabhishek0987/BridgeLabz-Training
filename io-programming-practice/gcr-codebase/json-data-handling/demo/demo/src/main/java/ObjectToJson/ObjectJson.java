import org.json.JSONObject;

public class ObjectJson {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2022);

        JSONObject carJson = new JSONObject(car);

        System.out.println(carJson.toString(4)); 
    }
}
