package Java.Lesson8.task2;

public class Task2 {

    public static void executeTask() throws ArithmeticException, RuntimeException {
        int d = 0;
        if (d == 0) {
            ArithmeticException e = new ArithmeticException("My arithmetic exception");
            throw e;
        }
        int a = 42 / d;
    }

    public static void main(String[] args) {
        try {
            executeTask();
            System.out.println("Random message");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
            // повторное возбуждение исключительной ситуации
            throw e;
        } catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}