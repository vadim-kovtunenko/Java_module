package Java.Lesson2.tasks;

import Java.Lesson1.utils.IOUtils;

public class Task1 {

    public static void executeTask() {
        System.out.println("Enter message:");
        String message = IOUtils.readText();
        if (message.equals("Hello!")) {
            System.out.println(1);
        } else if (message.equals("Bye!")) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}