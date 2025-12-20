import java.util.*;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Coffee name");
        String coffeeType = sc.nextLine();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();

        while(coffeeType!=null){
        switch (coffeeType) {
            case "Espresso":
                System.out.println("Total cost for " + quantity + " Espresso(s): $" + (quantity * 3));
                break;
            case "Latte":
                System.out.println("Total cost for " + quantity + " Latte(s): $" + (quantity * 4));
                break;
            case "Cappuccino":
                System.out.println("Total cost for " + quantity + " Cappuccino(s): $" + (quantity * 5));
                break;
            default:
                System.out.println("Invalid coffee type.");
                break;

        }
        if (coffeeType.equals("Espresso") || coffeeType.equals("Latte") || coffeeType.equals("Cappuccino")) {
            double GST = 18.5;
            System.out.println("GST on your order is: $" + (GST / 100) * (quantity+GST));

        }
        sc.close();
         System.exit(0);

    }
    
        
    }
}