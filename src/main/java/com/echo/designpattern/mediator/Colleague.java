package com.echo.designpattern.mediator;

public class Colleague extends AbstractColleague {

  private String name;

  public Colleague(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
