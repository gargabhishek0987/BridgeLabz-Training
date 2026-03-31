import java.util.Scanner;
public class UnifeeuserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		
		int discount = sc.nextInt();
		
		double discountedammount = fee/discount;
		double discountedfee = fee-discountedammount;
		
		System.out.println("the discount ammount is "+discountedammount+"and the discountedfee is"+discountedfee);
		
	
	}


}
