package practice.prep;

import java.util.Scanner;

public class CorporateEmailAccessControl {
    static void emailValidation(String email){

        String regex = "^[a-z]{3,}\\.[a-z]{3,}[0-9]{4}@(sales|marketing|IT|product)\\.company\\.com$";

        if(email.matches(regex)){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Access Denied");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0){
            String email = sc.nextLine();
            emailValidation(email);
        }
    }
}
