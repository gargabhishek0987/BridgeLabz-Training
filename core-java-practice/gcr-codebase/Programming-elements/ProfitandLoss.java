
public class ProfitandLoss {
	public static void main(String[] args) {
		int SellingPrice = 191;
		int CostPrice = 129;
		
		float Profit = SellingPrice-CostPrice;
		
		float ProfitPercentage = Profit/CostPrice *100; 
		
		System.out.println("The Cost Price is INR"+CostPrice+" and SellingPrice is INR"+SellingPrice);
		System.out.println("The profit is "+ Profit+" and ProfitPercentage is "+ProfitPercentage);
	}
}
