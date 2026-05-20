import java.util.Scanner;

public class LeMostraDezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
       /* System.out.print("Valor 1: ");
        v[0] = sc.nextInt();
        System.out.println("Valor 2: ");
        v[1] = sc.nextInt();
        System.out.print("Valor 3: ");
        v[2] = sc.nextInt();
        System.out.println("Valor 4: ");
        v[3] = sc.nextInt(); */
        for(int i = 0; i < 10; i++) { 
            System.out.print("digite o " + (i+1) + "\u00B0 valor: ");
            v[i] = sc.nextInt();
        }
        for(int i = 9; i >= 0; i--) { 
            System.out.print(v[i] + " ");
            v[i] = sc.nextInt();
        }
        sc.close();
    }
}
