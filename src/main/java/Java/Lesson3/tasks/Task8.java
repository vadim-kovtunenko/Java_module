package Java.Lesson3.tasks;


import Java.Lesson3.utils.IOUtils;

import java.util.Arrays;

public class Task8 {

    public static void executeTask() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomInt(1, 100);
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

}