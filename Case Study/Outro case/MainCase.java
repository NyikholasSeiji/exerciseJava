class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MainCase {

    public static void main(String[] args) {

        // Criando um array que pode armazenar 3 objetos Person
        Person[] people = new Person[3];

        // Criando os objetos
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Percorrendo o array
        for (int i = 0; i < people.length; i++) {
            people[i].display();
        }
    }
}