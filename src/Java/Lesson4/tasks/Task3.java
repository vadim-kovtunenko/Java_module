package Java.Lesson4.tasks;

import java.util.Arrays;

public class Task3 {

    public static void executeTask() {
        double[][][] array = new double[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = getRandomDouble(1, 100);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print("\n");
            }

            System.out.print("\n\n");
        }

        // сортировка 3-ех мерного массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Arrays.sort(array[i][j]);
            }
        }

        // Вывод трехмерного массива
        for (double[][] matrix : array) {
            for (double[] collection : matrix) {
                for (double element : collection) {
                    System.out.print(element + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n\n");
        }
    }

    private static double getRandomDouble(int min, int max) {
        return (Math.random() * (max - min)) + min;
    }
}
