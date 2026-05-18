import java.io.IOException;
import java.util.Scanner;

public class ExercicioIdade {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ano, mes, dia;
        ano = a / 365;
        a = a % 365;
        mes = a / 30;
        dia = a % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
