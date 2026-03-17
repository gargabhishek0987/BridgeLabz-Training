package practice.prep;

import java.time.LocalDate;
import java.util.Scanner;

public class GlobalShipmentManifestValidator {
    public void shipmentValidator(String s){
        String codeRegex = "^SHIP-[1-9]\\d{5}";
        String codeRegex1 = ".*(\\d)\\1{3}.*";

         String dateRegex = "^20[0-9]{2}-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";

        String modeRegex = "(AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT)";

        String weightRegex = "^(0|[1-9]*)\\.\\d{2}$";
        String statusRegex = "(DELIVERED|CANCELLED|IN_TRANSIT)";

        boolean flag = true;

        String[] part = s.split("\\|");

        String shipCode = part[0];
        String shipDate = part[1];
        String shipMode = part[2];
        String shipWeight = part[3];
        float weight = Float.parseFloat(shipWeight);
        String shipDeliveryStatus = part[4];




        if(part.length !=5 ){
            System.out.println("NON-COMPLIANT RECORD");
            return;
        }
        if(shipCode.matches(codeRegex) && !shipCode.matches(codeRegex1) && shipMode.matches(modeRegex) && shipDeliveryStatus.matches(statusRegex) && validDate(shipDate) && shipWeight.matches(weightRegex) ){
            if(weight >= 0 && weight <= 999999.99){
                System.out.println("COMPLIANT RECORD");
            }
        }
        else {
            System.out.println("NON-COMPLIANT RECORD");
        }



    }
     boolean validDate(String shipDate){
        try{
            LocalDate.parse(shipDate);
            return true;

        } catch (Exception e) {
            return false;
        }
     }

    public static void main(String[] args) {
        GlobalShipmentManifestValidator gsv = new GlobalShipmentManifestValidator();
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s = sc.nextLine();
            gsv.shipmentValidator(s);
        }
    }
}
