import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the age of " + (i + 1) + "person");
            age[i] = sc.nextInt();

        }
        for (int j = 0; j < age.length; j++) {
            if (age[j] <= 0) {
                 System.out.println("Invalid age");

        }
        else if(age[j]>=18){
            System.out.println("This person"+(j)+" is eligible for vote");

        }
        else if(age[j]<18){
            System.out.println("This person"+(j)+" is not eligible for vote");
        }}
    }}
