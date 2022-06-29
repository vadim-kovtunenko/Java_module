package Java.Lesson5;

import Java.Lesson5.task1.Animal;

public class Lesson5App {

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal("Andrew", false);
        System.out.println(dog.getName());
    }
}