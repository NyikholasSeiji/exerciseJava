//pedir para o usuário digitar 10 valores e armazená-lo num vetor
//somar todos os valores e exibir a soma final

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int[] v = new int[10];
            int soma = 0;
            for(int i = 0; i < 10; i++) { 
            System.out.print("digite o " + (i+1) + "\u00B0 valor: ");
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            soma += v[i];
        }
        double media = (double) soma/10;
        System.out.println("Valor: " + soma + "\nMedia: " + media);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            if (v[i] < media) {
                menor++;
            } else {
                maior++;
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
        sc.close();
    }
}
