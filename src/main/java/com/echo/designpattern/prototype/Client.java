package com.echo.designpattern.prototype;

public class Client {

  public static void main(String[] args) {
    Prototype origin = new Prototype();
    Prototype copyOfOrigin = (Prototype) origin.clone();
    copyOfOrigin.showInfo();
  }

}
