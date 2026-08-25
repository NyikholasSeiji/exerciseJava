public class Main {
    public static void main(String[] args) {
        Student student = new Student("Seiji", 20, "ADS");
        // using getter
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCourse() + "\n");
        // using setter
        student.setName("Marcos");
        student.setAge(21);
        student.setCourse("IT");

        student.display();
    }
}
