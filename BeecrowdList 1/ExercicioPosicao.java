import java.util.Scanner;

public class ExercicioPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int maior = a;
        int posicao = 1;

        for (int i = 2; i <= 100; i++) {
            a = sc.nextInt();
            if (a > maior) {
                maior = a;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}