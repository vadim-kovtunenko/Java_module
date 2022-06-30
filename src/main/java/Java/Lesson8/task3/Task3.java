package Java.Lesson8.task3;

import Java.Lesson8.utils.IOUtils;

public class Task3 {

    public static void executeTask() {
        IOUtils.printText("Please enter text to check if its palindrome");
        String message = IOUtils.readText();
        String messageWithoutSpaces = message.replace(" ", "");
        String reverseMessageWithoutSpaces = (new StringBuilder(messageWithoutSpaces)).reverse().toString();
        if (messageWithoutSpaces.equalsIgnoreCase(reverseMessageWithoutSpaces)) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }
}