package Java.Lesson4.tasks;

import java.util.Arrays;

public class Task2 {

    public static void executeTask() {
        int[][] matrix = new int[3][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandomInt(1, 15);
            }
            Arrays.sort(matrix[i]);
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.print("\n");
        }
    }

    private static int getRandomInt(int min, int max) {
        return (int) Math.round((Math.random() * (max - min)) + min);
    }
}