import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
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

            case 1 -> cadastrarAluno(students, scanner);
            case 2 -> listarAluno(students);
            case 3 -> {
                    System.out.print("Nome do aluno: ");
                    String name = scanner.nextLine();

                    buscarAluno(students, name);
                }
            case 4 -> {
                    System.out.print("Nome do aluno: ");
                    String name = scanner.nextLine();

                    removerAluno(students, name);
                }
            case 0 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida.");
        }

    } while (option != 0);
}
    public static void cadastrarAluno(ArrayList<Student> students, Scanner scanner) {
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        while (name.isBlank()) {
            System.out.println("\nNome vazio, tente novamente.\n");
            name = scanner.nextLine();
        }

        System.out.print("Idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        while (age <= 0) {
            System.out.println("\nIdade invalida, tente novamente.\n");
            age = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.print("Curso: ");
        String course = scanner.nextLine();

        while (course.isBlank()) {
            System.out.println("\nCurso vazio, tente novamente.\n");
            course = scanner.nextLine();
        }

        students.add(new Student(name, age, course));
    }
    public static void listarAluno(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
            System.out.println();
        }
    }
    public static void buscarAluno(ArrayList<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.get(i).display();
                System.out.println();
                return;
            }
        }
        System.out.println("\nAluno não encontrado.");
    }
    public static void removerAluno(ArrayList<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                return;
            }
        }
        System.out.println("\nAluno não identificado.\n");
    }
}
