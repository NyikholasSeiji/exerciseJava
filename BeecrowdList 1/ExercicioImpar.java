import java.util.Scanner;

public class ExercicioImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int x = sc.nextInt();
        for (int cont = 1; cont <= x; cont++) {
    	    if (cont % 2 != 0) {
    	        System.out.println(cont);
    	    }   
    	}
    }
}