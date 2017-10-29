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
        this.productivity = 0;
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

    public float getProductivity() throws ComputerPerformanceException{
        if (cpuFrequency <=0 || ram <=0 || videoCard <=0){
            throw new ComputerPerformanceException("CPU/RAM/Video cannot equal to/below zero!");
        }
        return productivity*cpuFrequency*ram*videoCard;
    }


    @Override
    public String toString() {
        float productivity = 0;
        try {
            productivity = getProductivity();
        } catch (ComputerPerformanceException e){
            e.printStackTrace();
            System.exit(1);

        }
        return "Computer:\n" +
                "Cpu frequency = " + cpuFrequency +
                "\nRAM = " + ram +
                "\nVideo card = " + videoCard +
                "\nProductivity = " + productivity;
    }
}
