package com.echo.designpattern.observer;

public class ObserverA implements IObserver {

  String name;

  public ObserverA(String name) {
    this.name = name;
  }

  @Override
  public void update(String state) {
    System.out.println("Observer type A: " + getName() + " has got notification, state: " + state);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
