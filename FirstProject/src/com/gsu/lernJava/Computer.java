package com.gsu.lernJava;

public class Computer {

    private float cpuFrequency;
    private int ram;
    private String videoCard;
    private float productivity = cpuFrequency*100;

    public Computer(float cpuFrequency, int ram, String videoCard, float productivity) {
        this.cpuFrequency = cpuFrequency;
        this.ram = ram;
        this.videoCard = videoCard;
        this.productivity = productivity;
    }

    public void setCpuFrequency(float cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setVideoCard(String videoCard) {
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

    public String getVideoCard() {
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
