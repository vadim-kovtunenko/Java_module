package Java.Lesson8.task4;

public class CarCannotStartException extends RuntimeException {

    public CarCannotStartException(String message) {
        super(message);
    }
}