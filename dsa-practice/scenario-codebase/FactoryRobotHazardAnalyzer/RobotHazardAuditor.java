
import java.util.Scanner;

public class RobotHazardAuditor {
    public static double machineRiskFactor(String machineryState ){
        double value =0; 
        if(machineryState.equals("Worn")){
            value = 1.3;
        }
        if(machineryState.equals("Faulty")){
            value = 2.0;

        }
        if(machineryState.equals("Critical")){
            value = 3.0;
        }
        return value;

    }
    public static double  CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
        
      if(!(armPrecision >= 0.0 && armPrecision <= 1.0)) {
        throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
      }
      if(!(workerDensity >= 1 && workerDensity <= 20)){
        throw new RobotSafetyException("Error: Worker density must be 1-20");
      }
      if(!(machineryState.equals("Worn")|| (machineryState.equals("Faulty")) || (machineryState.equals("Critical")))){
        throw new RobotSafetyException("Error: Unsupported machinery state");
      }

     


      double HazardRisk = ((1.0 - armPrecision) * 15.0 ) + (workerDensity*machineRiskFactor(machineryState));
      System.out.println(HazardRisk);
      


      return HazardRisk;


    }
    public static void main(String[] args) throws RobotSafetyException{
        Scanner sc = new Scanner(System.in);
       try {
         double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        String machineryState = sc.next();
       CalculateHazardRisk(armPrecision, workerDensity, machineryState);
        


           
       } catch (Exception e) {
        e.printStackTrace();
       }
        }

}

