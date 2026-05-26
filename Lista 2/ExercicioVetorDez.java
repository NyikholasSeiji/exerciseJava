import java.util.Scanner;

public class ExercicioVetorDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[15];
        int soma = 0;
        int media = 0;
        for (int i = 0; i < 15; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            soma+= v[i];
        }
        media = soma / 15;
        System.out.println("Média geral: " + media);
        sc.close();    
    }
}
