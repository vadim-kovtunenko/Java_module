package Java.Lesson3.tasks;


import Java.Lesson3.utils.IOUtils;

public class Task7 {

    public static void executeTask() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number: ");
            array[i] = IOUtils.readInteger();
            if (array[i] == 3) {
                break;
            }
        }

        System.out.println("Your array:");
        IOUtils.printArray(array);
    }
}