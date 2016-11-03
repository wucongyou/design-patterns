package com.echo.designpattern.factorymethod;

public class SMSSender implements ISender {

  @Override
  public void send(String message) {
    System.out.println("Sent SMS: " + message);
  }

}
