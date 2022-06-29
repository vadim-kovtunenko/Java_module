package Java.Lesson5.Task4;

import Java.Lesson5.utils.IOUtils;

public class Computer {

    public static final int MAX_WORK_CYCLES = 2;

    private final String processor;
    private final String randomAccessMemory;
    private final String hardDiskDrive;
    private boolean turnedOn;

    private int workCyclesCount;

    public Computer(String processor, String randomAccessMemory, String hardDiskDrive) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        this.turnedOn = false;
        this.workCyclesCount = 0;
    }

    public void turnOff() {
        this.turnedOn = false;
        IOUtils.printText("Computer turned off");
    }

    public void turnOn() {
        if (turnedOn) {
            IOUtils.printText("Computer already turned on");
            return;
        }
        if (workCyclesCount >= MAX_WORK_CYCLES) {
            IOUtils.printText("Computer is broken.");
            return;
        }
        int randomNumber = IOUtils.getRandomInt(0, 1);

        IOUtils.printText("Please enter number 0 or 1");
        int userNumber = IOUtils.readInteger();

        if (randomNumber != userNumber) {
            IOUtils.printText("Error occurred. Please try again later..");
            return;
        }

        workCyclesCount++;
        turnedOn = true;
        IOUtils.printText("Computer turned on successfully!!!");
    }

    public String getProcessor() {
        return processor;
    }

    public String getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public String getHardDiskDrive() {
        return hardDiskDrive;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getWorkCyclesCount() {
        return workCyclesCount;
    }

    public void displayInfo() {
        IOUtils.printText(toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", randomAccessMemory='" + randomAccessMemory + '\'' +
                ", hardDiskDrive='" + hardDiskDrive + '\'' +
                ", turnedOn=" + turnedOn +
                ", workCyclesCount=" + workCyclesCount +
                '}';
    }
}