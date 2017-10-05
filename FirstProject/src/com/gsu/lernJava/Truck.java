package com.gsu.lernJava;

public class Truck extends Auto {

    private int carrying;
    private String bodyType;

    public Truck(){}

    public Truck(String carModel, String engineType, int enginePower, int mass, float mileage) {
        super(carModel, engineType, enginePower, mass, mileage);
    }

    public Truck(String carModel, String engineType, int enginePower, int mass, float mileage, int carrying, String bodyType) {
        super(carModel, engineType, enginePower, mass, mileage);
        this.carrying = carrying;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarrying = " + carrying +
                ", \nBodyType = " + bodyType;
    }

    @Override
    public void model(){
        System.out.println("This is the Truck\n");
    }
}
