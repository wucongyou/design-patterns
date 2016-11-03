package com.echo.designpattern.abstractfactory;

public class MtkCPU implements ICPU {

  @Override
  public void doCalculate() {
    System.out.println("MTK CPU is calculating.");
  }

}
