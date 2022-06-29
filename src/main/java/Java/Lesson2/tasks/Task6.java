package Java.Lesson2.tasks;


import Java.Lesson2.utils.IOUtils;

public class Task6 {

    public static void executeTask() {
        IOUtils.printText("Enter integer number: ");
        int a = IOUtils.readInteger();
        int sum = testMethod(a);
        System.out.println(sum);
    }

    public static int testMethod(int a) {
        int sum = 10;

        for (int i = 0; i < a; i++) {
            if (i == 4) continue;
            if (i == 6) break;
            sum += i;
        }

        if (sum == 16) {
            return 2 * sum;
        }
        return sum;
    }
}