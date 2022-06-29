package Java.Lesson5.task1;

// объявление класса Animal
public class Animal {

    // переменная name, тип - String, модификатор доступа - private, значение по умолчанию - Default name1
    private String name = "Default name1";
    // переменная ableToFly, тип - boolean, модификатор доступа - private
    private boolean ableToFly;

    // конструктор по умолчанию. т.е. без аргументов. Имя конструктора = имя класса
    // конструктор ничего не возвращает!
    public Animal() {
        System.out.println("Hello, I'm animal");
        // стандартное значение переменной name
        name = "Default name";
    }

    // конструктор с 2 аргументами : String name, boolean isAbleToFly
    // конструктор ничего не возвращает!
    public Animal(String name, boolean isAbleToFly) {
        // задаем переменной класса name значение аргумента name
        this.name = name;
        // задаем переменной класса ableToFly значение аргумента isAbleToFly
        this.ableToFly = isAbleToFly;
    }

    // getter, возвращает текущее значение переменной name объекта
    public String getName() {
        return name;
    }

    // setter, ничего не возвращает, изменяет текущеее значение переменной на аргумент метода name
    public void setName(String name) {
        this.name = name;
    }

    public boolean isAbleToFly() {
        return ableToFly;
    }

    public void setAbleToFly(boolean ableToFly) {
        this.ableToFly = ableToFly;
    }

    public void makeSound() {
        System.out.println("I'm " + name + ". And i'm making noise");
    }


    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println(cat.getName());
        cat.setName("Jeffry");
        System.out.println(cat.getName());
        cat.makeSound();
    }
}