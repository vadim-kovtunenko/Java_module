package Java.Lesson6.task3;

public class Task3 {

    public static void main(String[] args) {
        // Guitar guitar = new Guitar();
        Playable guitar = new Guitar();
        guitar.play();
        guitar.anotherMethod();
        // Piano piano = new Piano(); - верно
        Playable piano = new Piano();
        piano.anotherMethod();
        piano.play();
        // обращение к константе внутри интерфейса
        double a = Playable.a;
    }
}
