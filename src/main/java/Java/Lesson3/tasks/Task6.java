package Java.Lesson3.tasks;

import Java.Lesson3.utils.IOUtils;

import java.util.Arrays;

public class Task6 {

    public static void executeTask() {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomInt(1, 10);
        }

        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (!sorted) Arrays.sort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.print('\n');

    }
}