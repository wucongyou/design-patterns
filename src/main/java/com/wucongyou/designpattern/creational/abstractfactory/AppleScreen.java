package com.wucongyou.designpattern.creational.abstractfactory;

/**
 * ConcreteProductB1.
 */
public class AppleScreen implements Screen {

    private String name;

    public AppleScreen(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(String.format("%s:%s:%s",
            "Apple", "Screen", name));
    }

}
