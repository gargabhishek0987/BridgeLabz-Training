import java.util.Scanner;

public class Calculator {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		float num1= sc.nextFloat();
		float num2 = sc.nextFloat();
		
	
		float add = num1+num2;
	    float sub = num1-num2;
	    float multi=  num1*num2;
	    float divi = num1/num2;
	    System.out.println("the addition , subtraction,multiplication and divisionvalue of 2 numbers are"+ add+" "+ sub+multi+divi);
	    
	    
	}
}
