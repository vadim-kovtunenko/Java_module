package Java.Lesson1.tasks;

import Java.Lesson1.utils.IOUtils;

public class Task5 {

    public static void executeTask() {
        IOUtils.printText("Enter 3 integer numbers: ");
        int a = IOUtils.readInteger();
        int b = IOUtils.readInteger();
        int c = IOUtils.readInteger();

        int positiveCount = 0;
        boolean isAPositive = a >= 0;
        boolean isBPositive = b >= 0;
        boolean isCPositive = c >= 0;
        positiveCount += isAPositive ? 1 : 0;
        positiveCount += isBPositive ? 1 : 0;
        positiveCount += isCPositive ? 1 : 0;

        IOUtils.printText("Number of positive numbers: " + positiveCount);
        IOUtils.printText("Number of negative numbers: " + (3 - positiveCount));
    }
}