// Exercise about calculating speeding traffic fines

import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speedLimit, carSpeed, speedDifference, fine;

        System.out.print("What is the speed limit of the avenue: ");
        speedLimit = sc.nextInt();

        System.out.print("What is the car speed on the avenue: ");
        carSpeed = sc.nextInt();

        speedDifference = carSpeed - speedLimit;

        if (speedDifference <= 10) {
            fine = 50;
            System.out.println("Pay a fine of R$ " + fine);
        } else if (speedDifference >= 11 && speedDifference <= 30) {
            fine = 100;
            System.out.println("Pay a fine of R$ " + fine);
        } else {
            fine = 200;
            System.out.println("Pay a fine of R$ " + fine);
        }
        sc.close();
    }
}