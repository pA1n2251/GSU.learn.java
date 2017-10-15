package com.gsu.lernJava;

import java.io.Serializable;

public class Computer implements Serializable{

    private float cpuFrequency;
    private int ram;
    private float videoCard;
    private float productivity ;

    public Computer(float cpuFrequency, int ram, float videoCard) {
        this.cpuFrequency = cpuFrequency;
        this.ram = ram;
        this.videoCard = videoCard;
        this.productivity = cpuFrequency*100;
    }

    public void setCpuFrequency(float cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setVideoCard(float videoCard) {
        this.videoCard = videoCard;
    }

    public void setProductivity(float productivity) {
        this.productivity = productivity;
    }

    public float getCpuFrequency() {
        return cpuFrequency;
    }

    public int getRam() {
        return ram;
    }

    public float getVideoCard() {
        return videoCard;
    }

    public float getProductivity() {
        return productivity;
    }

    @Override
    public String toString() {
        return "Computer:\n" +
                "Cpu frequency = " + cpuFrequency +
                "\nRAM = " + ram +
                "\nVideo card = " + videoCard +
                "\nProductivity = " + productivity;
    }
}
