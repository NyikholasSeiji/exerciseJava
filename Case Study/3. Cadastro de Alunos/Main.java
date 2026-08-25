import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Student student = new Student("Seiji", 20, "ADS");
        // using getter
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse() + "\n");
        // using setter
        student.setName("Marcos");
        student.setAge(21);
        student.setCourse("IT");

        student.display(); */
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Seiji", 20, "ADS"));
        students.add(new Student("Diego", 21, "ADS"));
        students.add(new Student("Marcos", 22, "IT"));

        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
            System.out.print("\n");
        }

        students.set(1, new Student("Andre", 18, "Pedagogia"));
        students.set(2, new Student("Lucas", 19, "ADS"));
        
        System.out.print("****After set()****\n\n");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
            System.out.print("\n");
        }
        students.remove(1);

        System.out.print("****After remove()****\n\n");

        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
            System.out.print("\n");
        }
        
        System.out.println("************************");
        
        cadastrarAluno(students);
        listarAluno(students);
        buscarAluno(students, "Diego");
        buscarAluno(students, "Leticia");
        removerAluno(students, "Levi");
        removerAluno(students, "Diego");
        listarAluno(students);
    }
    public static void cadastrarAluno(ArrayList<Student> students) {
        students.add(new Student("Diego", 21, "ADS"));
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
