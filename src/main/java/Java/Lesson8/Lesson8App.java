package Java.Lesson8;

import Java.Lesson8.task2.Task2;
import Java.Lesson8.task4.Task4;
import Java.Lesson8.task3.Task3;
import Java.Lesson8.utils.IOUtils;

public class Lesson8App {

    public static void main(String[] args) {
        IOUtils.printText("Choose task (1-2, 0 - finish program): ");
        int taskNumber = IOUtils.readInteger();
        while (taskNumber != 0) {
            switch (taskNumber) {
                case 1 -> Task2.executeTask();
                case 2 -> Task3.executeTask();
                case 3 -> Task4.executeTask();
            }
            IOUtils.printText("Choose task (1-2, 0 - finish program): ");
            taskNumber = IOUtils.readInteger();
        }
    }
}