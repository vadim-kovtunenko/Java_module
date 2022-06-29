package Java.Lesson1.tasks;


import Java.Lesson1.utils.IOUtils;

public class Task7 {

    public static void executeTask() {
        IOUtils.printText("Enter 2 integer numbers: ");
        int a = IOUtils.readInteger();
        int b = IOUtils.readInteger();

        String message;
        if (a == 0 || b == 0) {
            message = "Введен ноль.";
        } else if (a > b) {
            message = "Sum of numbers: " + (a + b);
        } else {
            message = "Difference between numbers: " + (b - a);
        }

        IOUtils.printText(message);
    }
}