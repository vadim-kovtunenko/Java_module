package Java.Lesson7.task2.entity;

import Java.Lesson7.task2.entity.AirTransport;

public class MilitaryTransport extends AirTransport {

    private boolean ejectionSystem;
    private int missileCount;

    public MilitaryTransport(double power, double maxSpeed, double wingspan, double takeOffSpeed,
                             boolean ejectionSystem, int missileCount) {
        super(power, maxSpeed, wingspan, takeOffSpeed);
        this.ejectionSystem = ejectionSystem;
        this.missileCount = missileCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying transport info");
        System.out.println(this);
    }

    public boolean launchMissile() {
        if (missileCount > 0) {
            return false;
        } else {
            missileCount--;
            return true;
        }
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getMissileCount() {
        return missileCount;
    }

    public void setMissileCount(int missileCount) {
        this.missileCount = missileCount;
    }
}
