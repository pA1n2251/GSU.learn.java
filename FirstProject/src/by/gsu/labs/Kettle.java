package by.gsu.labs;

import java.io.Serializable;

public class Kettle implements Serializable, Comparable<Kettle> {
    private String brand;
    private int capacity;
    private int averageRunningTime;
    private double maintenanceCosts;

    public Kettle(){}

    public Kettle(String brand, int capacity, int averageRunningTime, double maintenanceCosts) {
        this.brand = brand;
        this.capacity = capacity;
        this.averageRunningTime = averageRunningTime;
        this.maintenanceCosts = maintenanceCosts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAverageRunningTime() {
        return averageRunningTime;
    }

    public void setAverageRunningTime(int averageRunningTime) {
        this.averageRunningTime = averageRunningTime;
    }

    public double getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(double maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    @Override
    public int compareTo(Kettle o) {
        return brand.compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                " Capacity: " + capacity +
                " Average running time: " + averageRunningTime +
                " Maintenance costs: " + maintenanceCosts;
    }
}
