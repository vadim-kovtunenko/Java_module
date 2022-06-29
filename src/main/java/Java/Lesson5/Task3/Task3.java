package Java.Lesson5.Task3;

public class Task3 {

    public static void executeTask() {
        Fruit apple, banana, orange;
        Fruit[] fruits = new Fruit[3];

        apple = new Fruit();
        apple.setColor("Green");
        apple.setName("Apple");
        apple.setSugarAmount(50);
        fruits[0] = apple;

        banana = new Fruit("Banana", "Yellow", 30);
        fruits[1] = banana;
        orange = new Fruit("Orange", "Red", 40);
        fruits[2] = orange;

        for (Fruit fruit : fruits) {
            fruit.displayInfo();
        }
    }
}
