import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //multiples of 3 print "Fizz" and for the multiples of 5 print "Buzz" by for loop.
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive integer");
        }
    }
}