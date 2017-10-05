package com.gsu.lernJava;

public class Bus extends Auto{

    private int seats;

    public Bus(){}

    public Bus(String carModel, String engineType, int enginePower, int mass, float mileage) {
        super(carModel, engineType, enginePower, mass, mileage);
    }

    public Bus(String carModel, String engineType, int enginePower, int mass, float mileage, int seats) {
        super(carModel, engineType, enginePower, mass, mileage);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + "Bus{" +
                "seats=" + seats +
                '}';
    }

    @Override
    public void model(){
        System.out.println("This is the Bus\n");
    }

}
