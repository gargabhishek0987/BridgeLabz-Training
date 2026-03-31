
interface DisountRule{
    double applyDiscount(double amount);
    
}

// class FestivalDiscount implements DisountRule{
    
//     public double applyDiscount (double amount){
//         return amount * 0.80;  
//         }
// }

// class premiumuser implements DisountRule{
//     public double applyDiscount(double amount){
//         return amount*0.85;
        
//     }
// } 
// class Nodiscount implements DisountRule{
//     public double applyDiscount(double amount){
//         return amount;
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         double amount = 1000;
//                 DisountRule festivaldis = new FestivalDiscount();
//         System.out.println(festivaldis.applyDiscount(amount));
        
//         DisountRule premiumUser = new premiumuser();
// System.out.println(premiumUser.applyDiscount(amount));    

//         DisountRule Nodis = new Nodiscount();
//         System.out.println(        Nodis.applyDiscount(amount));
        
    
        
//     }
// }
 // demonstartion for lambda expressions and functional interface -- commented part is show why lambda expression has to used


public class DiscountCount{
    public static void main(String[] args){
        double value = 1000;
        DisountRule festivaldis = amount -> amount*0.80;
        DisountRule PremiumUser = amount -> amount*0.85;
        DisountRule Nodis = amount -> amount;
        
        System.out.println(festivaldis.applyDiscount(value));
        System.out.println(PremiumUser.applyDiscount(value));
        System.out.println(Nodis.applyDiscount(value));
    }
}



