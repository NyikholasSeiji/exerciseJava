import java.util.Scanner;

public class ExercicioPrimo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int contador = 0;   

            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
    }   
}
