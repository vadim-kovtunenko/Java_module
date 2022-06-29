package Java.Lesson6.task1;

public class Task1 {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setBonus(50);
        programmer.setSalary(100);
        System.out.println(programmer.calculateTotalSalary());
    }
}