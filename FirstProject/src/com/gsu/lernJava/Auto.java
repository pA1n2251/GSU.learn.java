package com.gsu.lernJava;

public class Auto {
    private String carModel;
    private String engineType;
    private int enginePower;
    private int mass;
    private float mileage;

    public Auto(){}

    public Auto(String carModel, String engineType, int enginePower) {
        this.carModel = carModel;
        this.engineType = engineType;
        this.enginePower = enginePower;
    }

    public Auto(String carModel, String engineType, int enginePower, int mass, float mileage) {
        this.carModel = carModel;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.mass = mass;
        this.mileage = mileage;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getMass() {
        return mass;
    }

    public float getMileage() {
        return mileage;
    }

    public void model() {
        System.out.println("This is the Auto\n");
    }

    @Override
    public String toString() {
        return  "Car model = " + carModel +
                ", \nEngine type = " + engineType +
                ", \nEngine power = " + enginePower +
                ", \nMass = " + mass +
                ", \nMileage = " + mileage;
    }
}
