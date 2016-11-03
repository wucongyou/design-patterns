package com.echo.designpattern.flyweight;

public class Client {

  public static void main(String[] args) {
    FlyweightFactory flyweightFactory = new FlyweightFactory();
    String[] keys = {"Google", "MS", "Google"};
    for (String key : keys) {
      AbstractFlyweight flyweight = flyweightFactory.getInstance(key);
      flyweight.doOperate();
      System.out.println(key + " visit count: " + flyweightFactory.visitCount(key));
    }
    System.out.println("Flyweights total size : " + flyweightFactory.size());
  }

}
