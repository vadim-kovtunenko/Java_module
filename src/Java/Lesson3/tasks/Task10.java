package Java.Lesson3.tasks;

import Java.Lesson3.utils.IOUtils;

public class Task10 {

    public static void executeTask() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomInt(1, 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nEnter number: ");
        int delimeter = IOUtils.readInteger();
        int count = 0, sum = 0;
        double average = 0.0;
        for (int element : array) {
            if (delimeter < element) {
                sum += element;
                count++;
            }
        }
        average = ((double) sum) / count;
        System.out.println("Average is " + average + ". Count is " + count);
        int sumElementsGreaterThanAverage = 0;
        for (int element : array) {
            if (element > average) {
                sumElementsGreaterThanAverage += element;
            }
        }
        System.out.println("Sum of elements greater than average is: " + sum);
    }
}