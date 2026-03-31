interface lightAction{
    void execute();
}

public class smartHome{
    public static void main(String[] args){
        lightAction motiondetect = () ->  System.out.println("Light controlled by motionSensor");
        lightAction nightmode = () -> System.out.println("light turned to dim as night mode appeared");
        
        lightAction off = () -> System.out.println("Lights turned off");
        motiondetect.execute();
        nightmode.execute();
        off.execute();

    }
}