package Java.Lesson4.tasks;

import java.util.Arrays;

public class Task1 {

    public static void executeTask() {
        // объявлем двумерный массив с типом int размером 3 x 3, 9 - элементов равных '0'
        int[][] matrix = new int[3][3];
        // цикл по строкам массива
        for (int i = 0; i < matrix.length; i++) {
            // цикл по элементам массива
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandomInt(1, 10);
            }
        }

        // прохождение по элементам массива без счетчика
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.print("\n");
        }

        // вывод массива используя Arrays
        System.out.println(Arrays.deepToString(matrix));

    }

    // Возвращает целое в диапозоне [min; max]
    private static int getRandomInt(int min, int max) {
        return (int) Math.round((Math.random() * (max - min)) + min);
    }


}