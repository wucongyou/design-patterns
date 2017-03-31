package com.echo.designpattern.creational.builder;

public class Computer {

    private String mainBoard;
    private String cpu;
    private String gpu;
    private String memory;
    private String disk;
    private String power;

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "mainBoard='" + mainBoard + '\'' +
            ", cpu='" + cpu + '\'' +
            ", gpu='" + gpu + '\'' +
            ", memory='" + memory + '\'' +
            ", disk='" + disk + '\'' +
            ", power='" + power + '\'' +
            '}';
    }
}
