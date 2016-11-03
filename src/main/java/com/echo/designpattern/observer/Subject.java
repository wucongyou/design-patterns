package com.echo.designpattern.observer;

public class Subject extends AbstractSubject {

  private String state;

  public void doChage(String state) {
    this.state = state;
    notifyObservers(state);
  }

}
