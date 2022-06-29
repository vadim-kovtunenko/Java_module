package Java.Lesson5.Task3;

import Java.Lesson5.utils.IOUtils;

public class Fruit {

    private String name;
    private String color;
    private int sugarAmount;

    public Fruit() {
        IOUtils.printText("New fruit created");
    }

    public Fruit(String name, String color, int sugarAmount) {
        this.name = name;
        this.color = color;
        this.sugarAmount = sugarAmount;
    }

    public void displayInfo() {
        IOUtils.printText("This is " + name + ". Its color is " + color + ".Amount of sugar is " + sugarAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }
}
