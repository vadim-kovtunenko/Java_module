package Java.Lesson1.tasks;

import Java.Lesson1.utils.IOUtils;

import java.util.Scanner;

public class Task3 {

    public static void executeTask() {
        System.out.println("Enter any message: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println("Your message is: " + message);
        IOUtils.printText(IOUtils.readText());
    }
}