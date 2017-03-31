package com.echo.designpattern.creational.builder;

public class PCBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public Builder mainBoard() {
        computer.setMainBoard("Intel");
        return this;
    }

    @Override
    public Builder cpu() {
        computer.setCpu("Intel");
        return this;
    }

    @Override
    public Builder gpu() {
        computer.setGpu("NVIDIA");
        return this;
    }

    @Override
    public Builder memory() {
        computer.setMemory("SanDisk");
        return this;
    }

    @Override
    public Builder disk() {
        computer.setDisk("SanDisk SSD");
        return this;
    }

    @Override
    public Builder power() {
        computer.setPower("Power");
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
