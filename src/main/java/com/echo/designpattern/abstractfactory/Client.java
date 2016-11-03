package com.echo.designpattern.abstractfactory;

public class Client {

  public static void main(String[] args) {
    IFactory factory = new SamsungMobilePhoneFactory();
    factory.assembleCPU().doCalculate();
    factory.assembleScreen().doDisplay();
  }

}
