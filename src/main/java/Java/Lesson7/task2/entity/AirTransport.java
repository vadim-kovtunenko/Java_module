package Java.Lesson7.task2.entity;


public class AirTransport extends Transport {

    protected double wingspan;
    protected double takeOffSpeed;

    public AirTransport(double power, double maxSpeed, double wingspan, double takeOffSpeed) {
        super(power, maxSpeed);
        this.wingspan = wingspan;
        this.takeOffSpeed = takeOffSpeed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying air transport info");
        System.out.println(this);
    }

    public boolean willTakeOff(double speed) {
        return speed >= takeOffSpeed;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getTakeOffSpeed() {
        return takeOffSpeed;
    }

    public void setTakeOffSpeed(double takeOffSpeed) {
        this.takeOffSpeed = takeOffSpeed;
    }
}
