package Java.Lesson2.tasks;

import Java.Lesson2.utils.IOUtils;

public class Task9 {

    public static void executeTask() {
        System.out.print("Enter start number: ");
        int begin = IOUtils.readInteger();
        System.out.print("Enter end number: ");
        int end = IOUtils.readInteger();
        int evenBegin = (begin + 1) >> 1 << 1;
        // 010 >> 1 = 001
        // 001 << 1 = 010
        // 2 >> 1 = 1
        // 1 << 1 = 2
        // 011 >> 1 = 001
        // 001 << 1 = 010
        // 3 >> 1 = 1
        // 3 << 1 = 2
        for (int i = evenBegin; i <= end; i += 2) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}