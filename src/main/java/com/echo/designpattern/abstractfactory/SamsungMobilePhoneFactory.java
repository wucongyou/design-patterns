package com.echo.designpattern.abstractfactory;

public class SamsungMobilePhoneFactory implements IFactory {

  @Override
  public ICPU assembleCPU() {
    return new QualcommCPU();
  }

  @Override
  public IScreen assembleScreen() {
    return new JDIScreen();
  }

}
