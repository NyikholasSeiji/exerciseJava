import java.util.Scanner;

public class ExercicioVetorTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        double[] y = new double[10];
        
        for (int i = 0; i < 10; i++) {
            v[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            y[i] = v[i] * v[i];
        }


        for(int i = 0; i < 10; i++) { 
            System.out.print(v[i] + "  ");
        }

        for(int i = 0; i < 10; i++) { 
            System.out.print(y[i] + "  ");
        }
        sc.close();
    }
}