package Java.Lesson7.task2.entity;


public class GroundTransport extends Transport {

    protected int numberOfWheels;
    protected double fuelConsumption;

    public GroundTransport(double power, double maxSpeed, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying ground transport info");
        System.out.println(this);
    }

    public double calculateConsumptedFuel(double duration) {
        double distance = calculateDistance(duration);
        return fuelConsumption * (distance / 100);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}