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
        
        System.out.print("After set()\n\n");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).display();
            System.out.print("\n");
        }
    }
}
