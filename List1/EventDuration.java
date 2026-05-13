// Exercise about calculating the duration of an event

import java.util.Scanner;

public class EventDuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHours, startMinutes, startSeconds, startTime,
            endHours, endMinutes, endSeconds, endTime, duration,
            hours, minutes, seconds, remainder;

        // Data input
        System.out.println("Enter the hour the event started: ");
        startHours = sc.nextInt();

        System.out.println("Enter the minutes the event started: ");
        startMinutes = sc.nextInt();

        System.out.println("Enter the seconds the event started: ");
        startSeconds = sc.nextInt();

        System.out.println("Enter the hour the event ended: ");
        endHours = sc.nextInt();

        System.out.println("Enter the minutes the event ended: ");
        endMinutes = sc.nextInt();

        System.out.println("Enter the seconds the event ended: ");
        endSeconds = sc.nextInt();

        // Processing
        startTime = startHours * 3600 + startMinutes * 60 + startSeconds;
        endTime = endHours * 3600 + endMinutes * 60 + endSeconds;

        duration = endTime - startTime;
        hours = duration / 3600;
        remainder = duration % 3600;
        minutes = remainder / 60;
        seconds = remainder % 60;

        // Output
        System.out.printf(
            "The event lasted %dh %dm %ds",
            hours, minutes, seconds
        );
        sc.close();
    }
}