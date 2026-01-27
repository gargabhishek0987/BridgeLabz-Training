import java.util.function.Predicate;

public class HospitalAlertSystem{
    public static void main(String[] args){
        Predicate<String> emergencyOnly = alert -> alert.contains("Emergency");
        Predicate<String> routineCheckupOnly = alert -> alert.contains("routineCheckup");
        
        String alert1 = "Emergency: this is critical ";
        String alert2 = "routineCheckup: this is normal case";
        
        System.out.println(emergencyOnly.test(alert1));
        System.out.println(routineCheckupOnly.test(alert2));
                System.out.println(routineCheckupOnly.test(alert1));

        
    }
}