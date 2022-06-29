package Java.Lesson4.tasks;

import java.util.Arrays;

public class Task5 {

    public static void executeTask() {
        String[][] desk = new String[8][8];
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    desk[i][j] = "W";
                } else {
                    desk[i][j] = "B";
                }
            }
        }

        for (String[] row : desk) {
            System.out.println(Arrays.toString(row));
        }
    }
}
