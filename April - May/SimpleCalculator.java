// Exercise about creating a simple calculator using switch-case

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;

        do {
            System.out.print(
                "Enter\n" +
                "+ = addition\n" +
                "- = subtraction\n" +
                "* = multiplication\n" +
                "/ = division\n" +
                "s = exit\n--> "
            );

            option = sc.nextLine().charAt(0);

            switch (option) {
                case '+': {
                    System.out.print("Enter the first value: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter the second value: ");
                    double b = sc.nextDouble();

                    System.out.println("\nAddition = " + (a + b) + "\n");
                    sc.nextLine();
                    break;
                } case '-': {
                    System.out.print("Enter the first value: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter the second value: ");
                    double b = sc.nextDouble();

                    System.out.println("\nSubtraction = " + (a - b) + "\n");
                    sc.nextLine();
                    break;
                } case '*': {
                    System.out.print("Enter the first value: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter the second value: ");
                    double b = sc.nextDouble();

                    System.out.println("\nMultiplication = " + (a * b) + "\n");
                    sc.nextLine();
                    break;
                } case '/': {
                    System.out.print("Enter the first value: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter the second value: ");
                    double b = sc.nextDouble();
                    if (b == 0.0) {
                        System.out.println("\nDivision by zero does not exist.\n");
                    } else {

                        System.out.println("\nDivision = " + (a / b) + "\n");
                    }
                    sc.nextLine();
                    break;
                }
                case 's':
                case 'S':
                    System.out.println("\nCome back anytime!");
                    break;
                default:
                    System.out.println("\nInvalid option.");
            }
        } while (option != 's' && option != 'S');
        sc.close();
    }
}