package Java.Lesson6.task2;

public class Task2 {

    public static void main(String[] args) {
        Employee programmer = new Programmer();
        programmer.setSalary(100);

        // приведение типов
        ((Programmer) programmer).setBonus(50);
        System.out.println(programmer.calculateTotalSalary());

        Employee engineer = new Engineer();
        System.out.println(engineer.calculateTotalSalary());
    }
}