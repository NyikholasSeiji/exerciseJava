//Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
//A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
//Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

import java.io.IOException;
import java.util.Scanner;

public class ExercicioMedia {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double media = (a*2 + b*3 + c*5)/10;
        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();
    }
}