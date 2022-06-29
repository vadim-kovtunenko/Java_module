package Java.Lesson6.task5;

public class Task5 {

    public static void executeTask() {
        Shape circle = new Circle(5.5);
        System.out.println(circle.areaFormula());
        Shape square = new Square(10);
        System.out.println(square.areaFormula());
    }
}