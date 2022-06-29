package Java.Lesson1.tasks;

import Java.Lesson1.utils.IOUtils;

public class Task4 {

    public static void executeTask() {
        IOUtils.printText("Enter double a: ");
        double a = IOUtils.readDouble();

        IOUtils.printText("Enter int b: ");
        int b = IOUtils.readInteger();

        int sumInt = (int) a + b;
        double sumDouble = a + (double) b;
        double multiplication = a * b;
        double remainder = a % b;
        int c = (int) a;

        IOUtils.printText("(int) a + b = " + sumInt);
        IOUtils.printText("a + (double) b = " + sumDouble);
        IOUtils.printText("a * b = " + multiplication);
        IOUtils.printText("a % b = " + remainder);
        IOUtils.printText("(int) a = " + c);
    }
}