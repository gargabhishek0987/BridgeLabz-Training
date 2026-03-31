//2001:0db8:85a3:0000:0000:8a2e:0370:7334::AA:1B:2C:3D:4E:5F
//^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}::([0-9A-F]{2}:){5}[0-9A-F]{2}$
import java.util.*;
public class Ipv6validator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = "GGGG:0db8:85a3:0000:0000:8a2e:0370:7334::AA:1B:2C:3D:4E:5F";

        String regex = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}::([0-9A-F]{2}:){5}[0-9A-F]{2}$";

        if(input.matches(regex)){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
