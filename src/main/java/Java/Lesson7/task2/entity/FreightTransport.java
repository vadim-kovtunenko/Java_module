package Java.Lesson7.task2.entity;

public class FreightTransport extends GroundTransport {

    private double carryingCapacity;

    public FreightTransport(double power, double maxSpeed, int numberOfWheels, double fuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying freight ground transport info");
        System.out.println(this);
    }

    public boolean validateCargo(double weight) {
        return weight <= carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
