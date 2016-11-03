package com.echo.designpattern.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

  private String name;
  private int level = RequestLevel.LEVEL_1;

  public ConcreteHandler1(String name) {
    this.name = name;
  }

  @Override
  public int getHandlerLevel() {
    return level;
  }

  @Override
  public String getHandlerDesc() {
    return name;
  }

}
