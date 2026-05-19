import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        soma = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > y){
            int b = x; 
            x = y;
            y = b;
        }
        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}