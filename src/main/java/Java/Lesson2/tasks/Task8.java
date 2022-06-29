package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task8 {

    public static void executeTask() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }
        IOUtils.printText("1 + 2 + .. + 99 = " + sum);
    }
}