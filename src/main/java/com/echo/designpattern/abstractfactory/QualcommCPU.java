package com.echo.designpattern.abstractfactory;

public class QualcommCPU implements ICPU {

  @Override
  public void doCalculate() {
    System.out.println("Qualcomm CPU is calculating.");
  }

}
