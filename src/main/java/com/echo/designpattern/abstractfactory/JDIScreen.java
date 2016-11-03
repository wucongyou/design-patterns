package com.echo.designpattern.abstractfactory;

public class JDIScreen implements IScreen {

  @Override
  public void doDisplay() {
    System.out.println("JDI screen is displaying.");
  }

}
