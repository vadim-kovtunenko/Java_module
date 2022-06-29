package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task3 {

    public static void executeTask() {
        System.out.println("Enter number:");
        int a = IOUtils.readInteger();

        // old style
        switch (a) {
            case 4:
                System.out.println(a*2);
                break;
            case 5:
            case 6:
                System.out.println(a*-10);
                break;
            default:
                System.out.println("Entered number is not one of the 4,5,6");
        }
        // new style
        switch (a) {
            case 4 -> System.out.println(a * 2);
            case 5, 6 -> System.out.println(a * -10);
            default -> System.out.println("Entered number is not one of the 4,5,6");
        }
    }
}