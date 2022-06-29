package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task2 {

    public static void executeTask() {
        System.out.println("Enter first number:");
        int a = IOUtils.readInteger();
        System.out.println("Enter second number:");
        int b = IOUtils.readInteger();

        int c = a > b ? a + b : 25;
        System.out.println("Result: " + c);
    }
}