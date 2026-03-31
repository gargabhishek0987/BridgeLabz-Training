
public class UniversityFee {
	public static void main(String[] args) {
		int fee = 125000;
		int discountPercent = 10;
		 int discount = fee/discountPercent;
		 
		 int discountedfee = fee-discount;
		 System.out.println("the discount amount is INR "+ discount +"and final discounted fee is INR"+ discountedfee);
	}

}
