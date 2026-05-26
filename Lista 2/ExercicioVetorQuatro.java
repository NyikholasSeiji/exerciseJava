import java.util.Scanner;

public class ExercicioVetorQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];
        for (int i = 0; i < 8; i++) {
            v[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = v[x] + v[y];
        System.out.print("Soma = " + soma);
        sc.close();
    }
}

