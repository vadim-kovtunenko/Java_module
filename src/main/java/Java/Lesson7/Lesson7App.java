package Java.Lesson7;

import Java.Lesson7.task1.Task1;
import Java.Lesson7.task2.entity.Task2;
import Java.Lesson7.utils.IOUtils;

public class Lesson7App {

    public static void main(String[] args) {
        IOUtils.printText("Choose task (1-2, 0 - finish program): ");
        int taskNumber = IOUtils.readInteger();
        while (taskNumber != 0) {
            switch (taskNumber) {
                case 1 -> Task1.executeTask();
                case 2 -> Task2.executeTask();
            }
            IOUtils.printText("Choose task (1-2, 0 - finish program): ");
            taskNumber = IOUtils.readInteger();
        }
    }
}