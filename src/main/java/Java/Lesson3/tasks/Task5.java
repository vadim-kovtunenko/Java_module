package Java.Lesson3.tasks;

import Java.Lesson3.utils.IOUtils;

public class Task5 {

    public static void executeTask() {
        int[] array = new int[15];
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomInt(0, 100);
            if (array[i] % 2 == 0) evenCount++;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nCount of even elements is: " + evenCount);
    }
}