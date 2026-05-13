// Exercise about finding all divisors of a positive number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int x = sc.nextInt();

        while (x <= 0) {
            System.out.println("Enter a positive number:");
            x = sc.nextInt();
        }

        for (int count = 1; count <= x; count++) {
            if (x % count == 0) {
                System.out.println("Divisor: " + count);
            }
        }
        sc.close();
    }
}