package com.echo.designpattern.abstractfactory;

public class Client {

  public static void main(String[] args) {
    IFactory factory = new SamsungFactory();
    factory.getCPU("Exynos-4210").doCalculate();
    factory.getScreen("AMOLED").doDisplay();

    factory = new AppleFactory();
    factory.getCPU("A10").doCalculate();
    factory.getScreen("IPS").doDisplay();
  }

}
