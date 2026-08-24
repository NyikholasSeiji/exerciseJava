import java.util.Scanner;

public class ExercicioVetorDezoito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % x == 0) {
                System.out.println(vetor[i]);
                contador++;
            }
        }
        System.out.println("Quantidade de múltiplos: " + contador);
        sc.close();
    }
}
