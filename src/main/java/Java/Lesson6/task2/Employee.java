package Java.Lesson6.task2;

public abstract class Employee {

    protected double salary;

    public abstract double calculateTotalSalary();

    public Employee() {
        System.out.println("Employee created");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}