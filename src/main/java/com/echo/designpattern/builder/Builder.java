package com.echo.designpattern.builder;

public class Builder implements IBuilder {

  Computer computer = new Computer();

  @Override
  public void buildMainBoard() {
    computer.setMainBoard("华擎主板");
  }

  @Override
  public void buildCPU() {
    computer.setCpu("i7-4700mq");
  }

  @Override
  public void buildGPU() {
    computer.setGpu("Nvidia GTX990");
  }

  @Override
  public void buildMemory() {
    computer.setMemory("Sandisk 8G");
  }

  @Override
  public void buildDisk() {
    computer.setDisk("Pulxter SSD 256G");
  }

  @Override
  public void buildPower() {
    computer.setPower("Power First");
  }

  @Override
  public Computer retrieveResult() {
    return computer;
  }

}
