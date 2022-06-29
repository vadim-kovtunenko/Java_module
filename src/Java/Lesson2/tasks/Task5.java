package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task5 {

    public static void executeTask() {
        IOUtils.printText("Enter int number: ");
        int i = IOUtils.readInteger();
        while (i > 1 && i < 10) {
            System.out.println(i);
            i--;
        }

//        do {
//            System.out.println(i);
//            i--;
//        } while (i > 1 && i < 10);

    }
}