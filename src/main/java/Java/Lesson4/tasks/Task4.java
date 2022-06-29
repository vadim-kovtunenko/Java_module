package Java.Lesson4.tasks;


import Java.Lesson4.utils.IOUtils;

public class Task4 {

    public static void executeTask() {
        int[][] matrixA, matrixB, matrixC;
        matrixA = new int[4][4];
        matrixB = new int[4][4];
        matrixC = new int[4][4];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = IOUtils.getRandomInt(1, 15);
                matrixB[i][j] = IOUtils.getRandomInt(1, 15);
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        IOUtils.printText("First matrix:");
        IOUtils.printMatrix(matrixA);

        IOUtils.printText("Second matrix:");
        IOUtils.printMatrix(matrixB);

        IOUtils.printText("Summary matrix:");
        IOUtils.printMatrix(matrixC);
    }
}