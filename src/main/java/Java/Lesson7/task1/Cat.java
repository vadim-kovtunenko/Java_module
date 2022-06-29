package Java.Lesson7.task1;

public final class Cat extends Animal implements Speakable {

    private String color;

    public Cat(String name, int age, boolean woolPresent, int amountOfLegs, String color) {
        super(name, age, woolPresent, amountOfLegs);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public void speak() {
        System.out.println("Meow meow");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "woolPresent=" + woolPresent +
                ", amountOfLegs=" + amountOfLegs +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}