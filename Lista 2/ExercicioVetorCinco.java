import java.util.Scanner;

public class ExercicioVetorCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        int contador = 0;
        for(int i = 0; i < 10; i++) {
            v[i] = sc.nextDouble();
        }
        for(int i = 0; i < 10; i++) {
            if (v[i] % 2 == 0) {
                contador++;
            }
            System.out.println("Qntd pares: " + contador);
         }
         sc.close();
    }
}
