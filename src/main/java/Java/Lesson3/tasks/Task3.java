package Java.Lesson3.tasks;

public class Task3 {

    public static void executeTask() {
        int sum = 0, count=0;
        for (int i = 1; i <= 99; i+=1) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Result: " + sum);
    }
}