import java.util.HashMap;
import java.util.Map;

public class SmartHomeLighting {

    interface LightBehavior {
        void activate();
    }

    public static void main(String[] args) {

        LightBehavior motionSensor = () -> System.out.println("Motion detected! Turning on lights.");
        LightBehavior morningTime = () -> System.out.println("Good morning! Soft lights activated.");
        LightBehavior voiceCommand = () -> System.out.println("Voice command received! Setting lights to your preference.");

        Map<String, LightBehavior> triggers = new HashMap<>();
        triggers.put("motion", motionSensor);
        triggers.put("morning", morningTime);
        triggers.put("voice", voiceCommand);

        System.out.println("Simulating Smart Home Lighting Automation:\n");

        triggers.get("motion").activate();
        triggers.get("morning").activate();
        triggers.get("voice").activate();
    }
}
