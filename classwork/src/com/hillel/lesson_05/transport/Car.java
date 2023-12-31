package com.hillel.lesson_05.transport;

public class Car extends GroundTransport {
    private String carNumber;
    private String type;
    private int tankSize;
    private int passCount;

    public Car(String name) {
        super(name);
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassCount() {
        return passCount;
    }

    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", type='" + type + '\'' +
                ", tankSize=" + tankSize +
                ", passCount=" + passCount +
                '}';
    }
}
