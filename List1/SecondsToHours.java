// Exercise about converting seconds into hours, minutes, and seconds

import java.util.Scanner;

public class SecondsToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time, hours, minutes, seconds, remainder;

        System.out.print("Enter how many seconds you want to convert: ");
        time = sc.nextInt();

        hours = time / 3600;
        remainder = time % 3600;

        minutes = remainder / 60;
        seconds = remainder % 60;

        System.out.println(
            time + " seconds are exactly: " +
            hours + "h " +
            minutes + "m " +
            seconds + "s."
        );
        sc.close();
    }
}