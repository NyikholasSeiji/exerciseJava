// Exercise about checking if a number is a divisor of another number

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter a positive number: ");
        number1 = sc.nextInt();

        while (number1 <= 0) {
            System.out.println("The number must be positive.");
            number1 = sc.nextInt();
        }

        System.out.print("Enter another positive number: ");
        number2 = sc.nextInt();

        while (number2 <= 0) {
            System.out.println("This number must also be positive.");
            number2 = sc.nextInt();
        }
        if (number1 % number2 == 0) {
            System.out.println(number2 + " is a divisor of " + number1);
        } else {
            System.out.println(number2 + " is not a divisor of " + number1);
        }
        sc.close();
    }
}