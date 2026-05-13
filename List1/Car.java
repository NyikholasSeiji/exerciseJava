// Exercise about calculating the final price of a car

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double factoryCost, tax, profit, finalPrice;

        System.out.print("What is the factory cost of the car? ");
        factoryCost = sc.nextDouble();

        tax = factoryCost * 0.45;
        profit = factoryCost * 0.12;
        finalPrice = factoryCost + tax + profit;

        System.out.printf(
            "The final store price will be: R$ %.2f%n" +
            "Taxes: R$ %.2f%n" +
            "Distributor profit: R$ %.2f",
            finalPrice, tax, profit
        );
        sc.close();
    }
}