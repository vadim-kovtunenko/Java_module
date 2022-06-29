package Java.Lesson6.task3;

public class Guitar implements Playable {

    // необязательно, т.к. Play имеет реализацию по умолчанию - default
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }

    // обязательно, т.к. anotherMethod - абстрактный
    @Override
    public void anotherMethod() {
        System.out.println("Called another method from guitar");
    }
}