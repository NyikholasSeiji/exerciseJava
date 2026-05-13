// Exercise about division and zero validation

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, division;

        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();

        if (number2 > 0) {
            division = number1 / number2;
            System.out.println("The result of the division is: " + division);
        } else {
            System.out.println("Division by ZERO");
        }
        sc.close();
    }
}