package Java.Lesson7.task1;

public abstract class Creature {

    protected String name;
    protected int age;

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
