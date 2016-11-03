package com.echo.designpattern.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

  private String name;
  private int level = RequestLevel.LEVEL_2;

  public ConcreteHandler2(String name) {
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
