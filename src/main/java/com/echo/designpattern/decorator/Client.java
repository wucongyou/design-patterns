package com.echo.designpattern.decorator;

public class Client {

  public static void main(String[] args) {
    IDecoratee decoratee = new Decoratee();
    IDecoratee decorator = new Decorator(decoratee);
    decorator.doSomething();
  }

}
