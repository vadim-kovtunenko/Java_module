package Java.Lesson7.task1;

public class Human extends Creature implements Speakable {

    private String surname;
    private String country;
    private double money;

    public Human(String name, int age, String surname, String country, double money) {
        super(name, age);
        this.surname = surname;
        this.country = country;
        this.money = money;
    }

    @Override
    public void displayInfo() {
        // System.out.println(toString()); - работает одинаково
        System.out.println(this);
    }

    @Override
    public void speak() {
        System.out.println("Hello! I'm " + name);
    }

    public double spendMoney(double expenses) {
        money = money - expenses;
        return money;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", money=" + money +
                '}';
    }
}