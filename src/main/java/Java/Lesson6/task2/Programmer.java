package Java.Lesson6.task2;

public class Programmer extends Employee {

    private double bonus;

    public Programmer() {
        super();
        System.out.println("Programmer created");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return bonus + salary;
    }
}