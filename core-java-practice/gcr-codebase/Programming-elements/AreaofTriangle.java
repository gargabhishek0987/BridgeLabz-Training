import java.util.Scanner;
public class AreaofTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int height = sc.nextInt();
		
		int AreaofTriangle = (base*height)/2;
		double AreainInches = AreaofTriangle/2.54;
	
		System.out.println("your height in cm is "+ AreaofTriangle+" and in inches is "+AreainInches);
		
	}

}
