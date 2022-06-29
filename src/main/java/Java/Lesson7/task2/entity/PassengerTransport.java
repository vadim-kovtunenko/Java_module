package Java.Lesson7.task2.entity;

import Java.Lesson7.task2.entity.GroundTransport;

public class PassengerTransport extends GroundTransport {

    private String type;
    private int maxPassengerCount;

    public PassengerTransport(double power, double maxSpeed, int numberOfWheels, double fuelConsumption,
                              String type, int maxPassengerCount) {
        super(power, maxSpeed, numberOfWheels, fuelConsumption);
        this.type = type;
        this.maxPassengerCount = maxPassengerCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying passenger ground transport info");
        System.out.println(this);
    }

    public boolean validatePassengerCount(int passengerCount) {
        return maxPassengerCount >= passengerCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public void setMaxPassengerCount(int maxPassengerCount) {
        this.maxPassengerCount = maxPassengerCount;
    }
}