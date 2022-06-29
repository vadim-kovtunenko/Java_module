package Java.Lesson7.task1;

public class Animal extends Creature {

    protected boolean woolPresent;
    protected int amountOfLegs;

    public Animal(String name, int age, boolean woolPresent, int amountOfLegs) {
        super(name, age);
        this.woolPresent = woolPresent;
        this.amountOfLegs = amountOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    public boolean isWoolPresent() {
        return woolPresent;
    }

    public void setWoolPresent(boolean woolPresent) {
        this.woolPresent = woolPresent;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "woolPresent=" + woolPresent +
                ", amountOfLegs=" + amountOfLegs +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
