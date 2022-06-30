package Java.Lesson8.task4;

import Java.Lesson8.utils.IOUtils;

public class Car {

    private double price;
    private double speed;
    private String brand;

    public Car() {
    }

    public Car(double price, double speed, String brand) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
    }

    public void start() throws CarCannotStartException {
        int randomNumber = IOUtils.getRandomInt(0, 20);
        if (randomNumber % 2 == 0) {
            throw new CarCannotStartException("Engine error!!!");
        }
        System.out.println("Started car: " + this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                ", brand='" + brand + '\'' +
                '}';
    }
}
