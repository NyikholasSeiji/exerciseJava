// Exercise about calculating the average grade of a student

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade1, grade2, grade3, average;

        System.out.print("Enter the first grade: ");
        grade1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        grade2 = sc.nextDouble();

        System.out.print("Enter the third grade: ");
        grade3 = sc.nextDouble();

        average = (grade1 + grade2 + grade3) / 3;

        if (average < 3) {
            System.out.println("Failed.");
        } else if (average >= 3 && average < 7) {
            System.out.println("Recovery exam.");
        } else {
            System.out.println("Approved.");
        }
        sc.close();
    }
}