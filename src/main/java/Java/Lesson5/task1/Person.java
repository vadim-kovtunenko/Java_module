package Java.Lesson5.task1;

public class Person {

    private String name; // имя
    private int age; // возраст

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // метод вывода данных о персонаже
    public void displayInfo() {
        System.out.println("Name=" + name + ",Age=" + age);
    }

    // конструктор по умолчанию
    public Person() {
        System.out.println("Hello, new Person created!");
    }

    // конструктор с двумя аргументами: int, String
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


}