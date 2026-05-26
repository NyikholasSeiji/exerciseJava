import java.util.Scanner;

public class ExercicioVetorOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] v = new double[10];

        int negativos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                negativos++;
            } if (v[i] > 0) {
                somaPositivos += v[i];
            }
        }
        System.out.println("Quantidade de numeros negativos: " + negativos);
        System.out.println("Soma dos numeros positivos: " + somaPositivos);
        sc.close();
    }
}