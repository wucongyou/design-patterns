package com.echo.designpattern.builder;

public class Director {

  private IBuilder builder;

  public Director(IBuilder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.buildMainBoard();
    builder.buildCpu();
    builder.buildGpu();
    builder.buildMemory();
    builder.buildDisk();
    builder.buildPower();
  }

}
