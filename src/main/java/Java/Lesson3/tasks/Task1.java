package Java.Lesson3.tasks;

import Java.Lesson3.utils.IOUtils;

public class Task1 {

    public static void executeTask() {
        double[] array = new double[5];
        // Заполнение массива случайными числа в диапозоне 0..100
        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomDouble(0, 100.0);
        }
        // вывод массива
        IOUtils.printArray(array);

        // принимаем 0 элемент за минимальный и максимальный
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            // поиск минимального
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            // поиск максимального
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // меняем местами минимальное и максимальное элементы массива
        swap(array, minIndex, maxIndex);

        // вывод массива
        IOUtils.printArray(array);

    }

    // обмен местами элементов с индексами indexA, indexB
    public static void swap(double[] array, int indexA, int indexB) {
        double temp = array[indexA]; // temp = 3
        array[indexA] = array[indexB]; // array {1,2,4,4,5}; temp = 3
        array[indexB] = temp;
    }
}