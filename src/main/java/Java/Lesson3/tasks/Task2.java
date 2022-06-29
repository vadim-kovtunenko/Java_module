package Java.Lesson3.tasks;


import Java.Lesson3.utils.IOUtils;

import java.util.Arrays;

public class Task2 {

    public static void executeTask() {
        int[] array = new int[10];
        // заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomInt(10, 100);
        }

        // сортировка массива
        Arrays.sort(array);

        IOUtils.printArray(array);
    }
}