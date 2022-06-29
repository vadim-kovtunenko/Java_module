package Java.Lesson7.task2.entity;

public class Transport {

    protected double power;
    protected double maxSpeed;

    public Transport(double power, double maxSpeed) {
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Displaying transport info");
        System.out.println(this);
    }

    public double calculateDistance(double duration) {
        return duration * maxSpeed;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
