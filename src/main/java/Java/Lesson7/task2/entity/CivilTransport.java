package Java.Lesson7.task2.entity;


public class CivilTransport extends AirTransport {

    private int maxPassengerCount;
    private boolean businessClass;

    public CivilTransport(double power, double maxSpeed, double wingspan, double takeOffSpeed, int maxPassengerCount,
                          boolean businessClass) {
        super(power, maxSpeed, wingspan, takeOffSpeed);
        this.maxPassengerCount = maxPassengerCount;
        this.businessClass = businessClass;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying transport info");
        System.out.println(this);
    }

    public boolean willTakeOff(double speed, int passengerCount) {
        if (passengerCount > maxPassengerCount) {
            int extraPassengerCount = passengerCount - maxPassengerCount;
            double requiredSpeed = takeOffSpeed + (extraPassengerCount * 2);
            return speed > requiredSpeed;
        } else {
            return speed > takeOffSpeed;
        }
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public void setMaxPassengerCount(int maxPassengerCount) {
        this.maxPassengerCount = maxPassengerCount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
