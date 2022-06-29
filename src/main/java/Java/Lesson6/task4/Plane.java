package Java.Lesson6.task4;

public class Plane implements Fly {

    @Override
    public String fly() {
        String message = "You called method fly() in Plane!";
        System.out.println(message);
        return message;
    }
}
