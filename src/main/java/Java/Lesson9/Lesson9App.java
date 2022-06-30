package Java.Lesson9;

import Java.Lesson9.task1.Task1;
import Java.Lesson9.task2.Task2;
import Java.Lesson9.task3.Task3;
import Java.Lesson9.utils.IOUtils;

public class Lesson9App {

    public static void main(String[] args) {
        IOUtils.printText("Choose task (1-4, 0 - finish program): ");
        int taskNumber = IOUtils.readInteger();
        while (taskNumber != 0) {
            switch (taskNumber) {
                case 1 -> Task1.executeTask();
                case 2 -> Task2.executeTask();
                case 3 -> Task3.executeTask();
            }
            IOUtils.printText("Choose task (1-4, 0 - finish program): ");
            taskNumber = IOUtils.readInteger();
        }
    }
}