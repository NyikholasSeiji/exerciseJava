// Exercise about comparing a number with the sum of two others

import java.util.Scanner;

public class GreaterThanSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1, number2, number3;

        System.out.print("Enter the first number: ");
        number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();

        System.out.print("Enter the third number: ");
        number3 = sc.nextDouble();

        double sum = number2 + number3;

        if (number1 > sum) {
            System.out.println("The first number is greater than the sum of the other two.");
        } else if (number1 < sum) {
            System.out.println("The sum of the second and third numbers is greater than the first number.");
        } else {
            System.out.println("The first number is equal to the sum of the other two.");
        }
        sc.close();
    }
}