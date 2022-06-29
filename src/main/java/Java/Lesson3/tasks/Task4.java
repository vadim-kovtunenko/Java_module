package Java.Lesson3.tasks;


import Java.Lesson3.utils.IOUtils;

public class Task4 {

    private static final double RATIO_INCH_TO_CM = 2.54;

    public static void executeTask() {
        System.out.print("Please choose cm(cm) or inches (inch): ");
        String measure = IOUtils.readText();
        // "cm".equalsIgnoreCase("CM"); // true
        double originValue, transformedValue;
        while (true) {
            switch (measure) {
                case "cm" -> {
                    System.out.print("Please enter number of cm: ");
                    originValue = IOUtils.readDouble();
                    transformedValue = originValue / RATIO_INCH_TO_CM;
                    System.out.println("Number of inches is " + transformedValue);
                    return;
                }
                case "inch" -> {
                    System.out.print("Please enter number of inches: ");
                    originValue = IOUtils.readDouble();
                    transformedValue = originValue * RATIO_INCH_TO_CM;
                    System.out.println("Number of centimeters is " + transformedValue);
                    return;
                }
                default -> {
                    System.out.println("Error. Please choose cm or inches");
                    System.out.print("Please choose cm(cm) or inches (inch): ");
                    measure = IOUtils.readText();
                }

            }
        }
    }
}