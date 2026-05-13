// Exercise about calculating the final average using integer and real numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade1, grade2, grade3, average;
        double grade_1, grade_2, grade_3, averageDouble;

        // Integer average

        System.out.print("Enter the first grade: ");
        grade1 = sc.nextInt();

        System.out.print("Enter the second grade: ");
        grade2 = sc.nextInt();

        System.out.print("Enter the third grade: ");
        grade3 = sc.nextInt();

        average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Your average is: " + average);

        // Double average

        System.out.print("\nEnter the first grade: ");
        grade_1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        grade_2 = sc.nextDouble();

        System.out.print("Enter the third grade: ");
        grade_3 = sc.nextDouble();

        averageDouble = (grade_1 + grade_2 + grade_3) / 3;

        System.out.printf("Your average is: %.2f", averageDouble);

        sc.close();
    }
}