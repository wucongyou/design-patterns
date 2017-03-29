package com.echo.designpattern.flyweight;

public class Flyweight extends AbstractFlyweight {

    public Flyweight(String name) {
        super.name = name;
    }

    @Override
    public void doOperate() {
        System.out.println("Flyweight : " + name + " @" + this);
    }

}
