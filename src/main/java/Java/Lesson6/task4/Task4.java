package Java.Lesson6.task4;

public class Task4 {

    public static void executeTask() {
        Car car = new Car();
        Plane plane = new Plane();
        String messageFromCar = car.fly();
        System.out.println(messageFromCar);
        // 2 шага: 1)plane.fly() - выполняется раньше  2) System.out.println - вызывается 2
        System.out.println(plane.fly());
    }
}