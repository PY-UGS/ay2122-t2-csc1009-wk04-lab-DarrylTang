import java.util.Scanner;

public class Qn01 {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();

        System.out.print("Enter height in inches: ");
        float height = input.nextFloat();

        BMI bmi = new BMI(weight, height);
        bmi.printBMI();
    }
}
