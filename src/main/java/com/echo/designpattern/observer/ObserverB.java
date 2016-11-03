package com.echo.designpattern.observer;

public class ObserverB implements IObserver {

  String name;

  public ObserverB(String name) {
    this.name = name;
  }

  @Override
  public void update(String state) {
    System.out.println("Observer type B: " + getName() + " has got notification, state: " + state +
        ", and did something");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
