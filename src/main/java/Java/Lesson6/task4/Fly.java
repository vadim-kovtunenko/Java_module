package Java.Lesson6.task4;

public interface Fly {

    // без реализации по умолчанию
    String fly();

    // реализация по умолчанию
    default String fly1() {
        return "default String";
    }
}