import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int option;
    do {
        System.out.println("\n===== SISTEMA DE ALUNOS =====");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Buscar aluno");
        System.out.println("4 - Remover aluno");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        option = scanner.nextInt();
        scanner.nextLine();
            switch (option) {
                case 1 -> manager.cadastrarAluno(scanner);
                case 2 -> manager.listarAluno();
                case 3 -> {
                        System.out.print("Nome do aluno: ");
                        String name = scanner.nextLine();

                        manager.buscarAluno(name);
                    }
                case 4 -> {
                        System.out.print("Nome do aluno: ");
                        String name = scanner.nextLine();

                        manager.removerAluno(name);
                    }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }
}