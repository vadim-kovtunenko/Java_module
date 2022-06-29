package Java.Lesson7.task2.dispatcher;

public class Route {

    private double duration;
    private int passengerCount;
    private double capacity;

    public Route(double duration, int passengerCount, double capacity) {
        this.duration = duration;
        this.passengerCount = passengerCount;
        this.capacity = capacity;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}