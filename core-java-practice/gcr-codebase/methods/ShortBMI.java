import java.util.*;

public class ShortBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Weight (kg) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);

            double bmi = data[i][2];
            status[i] = bmi < 18.5 ? "Underweight" :
                        bmi < 25   ? "Normal" :
                        bmi < 30   ? "Overweight" : "Obese";
        }

        System.out.println("\nWt(kg)\tHt(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }
        sc.close();
    }
}