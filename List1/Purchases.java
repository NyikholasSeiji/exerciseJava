// Exercise about calculating purchase installments with interest

import java.util.Scanner;

public class Purchases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable declaration
        double purchaseValue, interest, finalValue, installmentValue;
        int installments;

        System.out.print("Enter the purchase value: ");
        purchaseValue = sc.nextDouble();

        System.out.print("Enter the number of installments (2, 3, or 4): ");
        installments = sc.nextInt();

        if (installments == 2) {
            interest = 5.0 / 100 * purchaseValue;
            finalValue = interest + purchaseValue;
            installmentValue = finalValue / installments;

            System.out.println(
                "\nFinal value will be: R$ " + finalValue +
                "\nInterest added: R$ " + interest +
                "\nValue of each installment: R$ " + installmentValue
            );
        } else if (installments == 3) {
            interest = 10.0 / 100 * purchaseValue;
            finalValue = interest + purchaseValue;
            installmentValue = finalValue / installments;

            System.out.println(
                "\nFinal value will be: R$ " + finalValue +
                "\nInterest added: R$ " + interest +
                "\nValue of each installment: R$ " + installmentValue
            );
        } else if (installments == 4) {
            interest = 15.0 / 100 * purchaseValue;
            finalValue = interest + purchaseValue;
            installmentValue = finalValue / installments;

            System.out.println(
                "\nFinal value will be: R$ " + finalValue +
                "\nInterest added: R$ " + interest +
                "\nValue of each installment: R$ " + installmentValue
            );
        } else {
            System.out.println("\nChoose a valid number of installments.");
        }
        sc.close();
    }
}