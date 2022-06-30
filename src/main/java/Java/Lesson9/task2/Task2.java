package Java.Lesson9.task2;

import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void executeTask() {
        Set<Human> humans = new HashSet<>();
        Human vadim = new Human("Vadim");
        humans.add(vadim);
        Human roma2 = new Human("Vadim");
        humans.add(roma2); // false - не добавился
        Human Vadim = new Human("Vadim");
        humans.add(Vadim);
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public static void main(String[] args) {
        executeTask();
    }
}
