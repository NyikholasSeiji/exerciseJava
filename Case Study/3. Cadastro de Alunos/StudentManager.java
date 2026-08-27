import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void cadastrarAluno(Scanner scanner) {
        System.out.print("Nome: ");
        String name = scanner.nextLine();

        while (name.isBlank()) {
            System.out.println("\nNome vazio, tente novamente.\n");
            name = scanner.nextLine();
        }

        int age;

        while (true) {
            try {
                System.out.print("Idade: ");
                age = scanner.nextInt();
                scanner.nextLine();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Idade inválida!");
                scanner.nextLine();
            }
        }

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
        public void listarAluno() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
            System.out.println();
        }
    }
    public void buscarAluno(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.get(i).display();
                System.out.println();
                return;
            }
        }
        System.out.println("\nAluno não encontrado.");
    }
    public void removerAluno(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                return;
            }
        }
        System.out.println("\nAluno não identificado.\n");
    }
}