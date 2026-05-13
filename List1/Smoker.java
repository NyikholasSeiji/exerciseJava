// Exercise about calculating the total money spent on cigarettes

import java.util.Scanner;

public class Smoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearsSmoking, cigarettesPerDay;
        double packPrice, totalCost;

        System.out.print("How many years have you been smoking: ");
        yearsSmoking = sc.nextInt();

        System.out.print("Number of cigarettes smoked per day: ");
        cigarettesPerDay = sc.nextInt();

        System.out.print("Price of a pack with 20 cigarettes: ");
        packPrice = sc.nextDouble();

        int days = yearsSmoking * 365;
        int totalCigarettes = cigarettesPerDay * days;
        int packs = totalCigarettes / 20;

        totalCost = packs * packPrice;

        System.out.printf("The total amount spent is: R$ %.2f", totalCost);

        sc.close();
    }
}