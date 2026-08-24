package Classes;

class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.display();

        Person person2 = new Person("Alice", 30);
        person2.display();

        Person person3 = new Person("Paulo", 15);
        person3.display();

        Person person4 = new Person(person2);
        person4.display();
    }
}