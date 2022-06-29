package Java.Lesson3;

import Java.Lesson3.utils.IOUtils;
import Java.Lesson3.tasks.*;

public class Lesson3App {

    public static void main(String[] args) {
        IOUtils.printText("Choose task (0-10, 0 - finish program): ");
        int taskNumber = IOUtils.readInteger();
        while (taskNumber != 0) {
            switch (taskNumber) {
                case 1 -> Task1.executeTask();
                case 2 -> Task2.executeTask();
                case 3 -> Task3.executeTask();
                case 4 -> Task4.executeTask();
                case 5 -> Task5.executeTask();
                case 6 -> Task6.executeTask();
                case 7 -> Task7.executeTask();
                case 8 -> Task8.executeTask();
                case 9 -> Task9.executeTask();
                case 10 -> Task10.executeTask();
            }
            IOUtils.printText("Choose task (0-6, 0 - finish program): ");
            taskNumber = IOUtils.readInteger();
        }
    }
}