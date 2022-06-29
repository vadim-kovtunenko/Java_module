package Java.Lesson4.tasks;


import Java.Lesson4.utils.IOUtils;

public class Task6 {

    public static void executeTask() {
        int[][] matrix = new int[5][5];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = IOUtils.getRandomInt(1, 10);
                if (i < j) {
                    sum += matrix[i][j];
                }
            }
        }
        IOUtils.printMatrix(matrix);
        IOUtils.printText("Sum of elements above main diagonal: " + sum);
    }
}