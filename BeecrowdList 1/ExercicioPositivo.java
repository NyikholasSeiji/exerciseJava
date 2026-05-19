import java.util.Scanner;

public class ExercicioPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        int z = 0;

        if (a > 0) {
            z++;
        } if (b > 0) {
            z++;
        } if (c > 0) {
            z++;
        } if (d > 0) {
            z++;
        } if (e > 0) {
            z++;
        } if (f >0) {
            z++;
        }

        System.out.println(z + " valores positivos");
    }
}   