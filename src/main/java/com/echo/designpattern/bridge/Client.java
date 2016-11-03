package com.echo.designpattern.bridge;

public class Client {

  public static void main(String[] args) {
    AbstractionA abstractionA = new AbstractionA(new ImplementorA());
    abstractionA.operation();
    abstractionA.anotherOperation();

    RefinedAbstratcion refinedAbstratcion = new RefinedAbstratcion(new RefinedImplementor());
    refinedAbstratcion.operation();
    refinedAbstratcion.anotherOperation();
  }

}
