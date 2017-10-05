package com.gsu.lernJava;

public class Car extends Auto {

    private float fuelConsumption;
    private int accelerationTime;

    public Car(){}

    public Car(String carModel, String engineType, int enginePower, int mass, float mileage) {
        super(carModel, engineType, enginePower, mass, mileage);
    }

    public Car(String carModel, String engineType, int enginePower, int mass, float mileage, float fuelConsumption, int accelerationTime) {
        super(carModel, engineType, enginePower, mass, mileage);
        this.fuelConsumption = fuelConsumption;
        this.accelerationTime = accelerationTime;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "Fuel consumption=" + fuelConsumption +
                ", acceleration time=" + accelerationTime +
                '}';
    }

    @Override
    public void model(){
        System.out.println("This is the Car\n");
    }
}
