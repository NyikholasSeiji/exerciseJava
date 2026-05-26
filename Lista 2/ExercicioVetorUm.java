public class ExercicioVetorUm {
    public static void main(String[] args) {
        // (a) Criando e atribuindo valores ao vetor
        int[] a = {1, 0, 5, -2, -5, 7};

        // (b) Soma das posições A[0], A[1] e A[5]
        int soma = a[0] + a[1] + a[5];

        System.out.println("Soma = " + soma);

        // (c) Modificando o valor da posição 4
        a[4] = 100;

        // (d) Mostrando os valores do vetor
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}