package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task7 {

    public static void executeTask() {
        double totalDistance = 0;
        double currentDailyDistance = 5;
        for (int i = 1; i <= 5; i++) {
            totalDistance += currentDailyDistance;
            currentDailyDistance *= 1.1; // 100 % + 10 % = 110 % / 100 = 1,1
        }
        IOUtils.printText("Total distance: " + totalDistance);
    }
}