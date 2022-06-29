package Java.Lesson6.task3;

public interface Playable {

    // константа, public static final - не обязательно писать, по умолчанию.
    public static final double a = 2.4;

    // метод с реализацией по умолчанию
    default void play() {
        System.out.println("Do nothing." + a);
    }

    void anotherMethod();


    // приватный метод, доступен только внутри интерфейса
    private void privateMethod() {
        System.out.println("Called private method");
    }
}