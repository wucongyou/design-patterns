package com.echo.designpattern.abstractfactory;

public class SamsungFactory implements IFactory {

  @Override
  public ICPU getCPU(String name) {
    return new SamsungCPU(name);
  }

  @Override
  public IScreen getScreen(String name) {
    return new SamsungScreen(name);
  }

}
