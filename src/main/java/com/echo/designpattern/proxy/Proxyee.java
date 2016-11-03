package com.echo.designpattern.proxy;

public class Proxyee implements IProxy {

  @Override
  public void doSomething() {
    System.out.println("This is the origin doSomething of proxyee");
  }

}
