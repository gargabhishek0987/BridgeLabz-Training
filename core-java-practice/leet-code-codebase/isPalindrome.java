import java.util.Scanner;

public class isPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is plaindrome or not ");

		int x = sc.nextInt();
		System.out.println(isPalindromeornot(x));
		
	}
	public static boolean isPalindromeornot(int x) {
           int sum = 0;

		int target = x;
		
		while(x>0) {
			int temp = x%10;
			x=x/10;
			sum = sum*10+temp;
			
		}
		return sum==target;
	}

}
