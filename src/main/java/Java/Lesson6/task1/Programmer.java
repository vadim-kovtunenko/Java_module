package Java.Lesson6.task1;

import Java.Lesson6.task1.Employee;

public class Programmer extends Employee {

    private double bonus;

    public double calculateTotalSalary() {
        return bonus + super.salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
