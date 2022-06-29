package Java.Lesson1;

import Java.Lesson1.tasks.*;
import Java.Lesson1.utils.IOUtils;

public class Lesson1App {

    public static void main(String[] args) {
        IOUtils.printText("Choose task (2-7, 0 - finish program): ");
        int taskNumber = IOUtils.readInteger();
        while (taskNumber != 0) {
            switch (taskNumber) {
                case 2 -> Task2.executeTask();
                case 3 -> Task3.executeTask();
                case 4 -> Task4.executeTask();
                case 5 -> Task5.executeTask();
                case 6 -> Task6.executeTask();
                case 7 -> Task7.executeTask();
            }
            IOUtils.printText("Choose task (0-6, 0 - finish program): ");
            taskNumber = IOUtils.readInteger();
        }
    }
}