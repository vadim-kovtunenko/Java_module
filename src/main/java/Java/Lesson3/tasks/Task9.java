package Java.Lesson3.tasks;


import Java.Lesson3.utils.IOUtils;

public class Task9 {

    public static void executeTask() {
        System.out.print("Enter size of array: ");
        int size = IOUtils.readInteger();
        if (size <= 0) {
            System.out.println("You entered invalid value");
            return;
        }
        int[] array = new int[size];
        int sumLeftPart = 0, sumRightPart = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = IOUtils.getRandomInt(0, 16);
            System.out.print(array[i] + " ");
            if (i < (array.length / 2)) {
                sumLeftPart += array[i];
            } else {
                sumRightPart += array[i];
            }
        }
        if (sumLeftPart > sumRightPart) {
            System.out.println("\nСумма левой части больше правой: " + sumLeftPart + " > " + sumRightPart);
        } else if (sumRightPart > sumLeftPart) {
            System.out.println("\nСумма левой части меньше правой: " + sumLeftPart + " < " + sumRightPart);
        } else {
            System.out.println("\nСумма левой части равна правой: " + sumLeftPart + " == " + sumRightPart);
        }
    }
}