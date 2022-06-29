package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task10 {

    public static void executeTask() {
        System.out.print("Enter number: ");
        int i = IOUtils.readInteger();
        for (int j = 1; j <= i; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j = i; j >= 1; j--) {
            for (int k = 0; k < j; k++ ) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}