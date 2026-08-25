import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<Student> students = new ArrayList<>();

    cadastrarAluno(students);

    listarAluno(students);

    buscarAluno(students, "Seiji");

    removerAluno(students, "Paulo");
}
    public static void cadastrarAluno(ArrayList<Student> students) {
        students.add(new Student("Seiji", 20, "ADS"));
        students.add(new Student("Paulo", 18, "AI"));
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
