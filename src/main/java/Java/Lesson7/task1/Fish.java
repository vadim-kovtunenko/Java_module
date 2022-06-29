package Java.Lesson7.task1;

import Java.Lesson7.task1.Animal;

public class Fish extends Animal {

    private int caviarAmount;
    private boolean freshwater;
    private String caviarColor;

    public Fish(String name, int age, boolean woolPresent, int amountOfLegs, int caviarAmount, boolean freshwater, String caviarColor) {
        super(name, age, woolPresent, amountOfLegs);
        this.caviarAmount = caviarAmount;
        this.freshwater = freshwater;
        this.caviarColor = caviarColor;
    }

    public int layEggs() {
        int newFishCount = (int) Math.round((Math.random() * (caviarAmount)));
        caviarAmount = 0;
        return newFishCount;
    }

    public int getCaviarAmount() {
        return caviarAmount;
    }

    public void setCaviarAmount(int caviarAmount) {
        this.caviarAmount = caviarAmount;
    }

    public boolean isFreshwater() {
        return freshwater;
    }

    public void setFreshwater(boolean freshwater) {
        this.freshwater = freshwater;
    }

    public String getCaviarColor() {
        return caviarColor;
    }

    public void setCaviarColor(String caviarColor) {
        this.caviarColor = caviarColor;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "woolPresent=" + woolPresent +
                ", amountOfLegs=" + amountOfLegs +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", caviarAmount=" + caviarAmount +
                ", freshwater=" + freshwater +
                ", caviarColor=" + caviarColor +
                '}';
    }
}