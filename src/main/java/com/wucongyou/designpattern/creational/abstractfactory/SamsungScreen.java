package com.wucongyou.designpattern.creational.abstractfactory;

/**
 * ConcreteProductB2.
 */
public class SamsungScreen implements Screen {

    private String name;

    public SamsungScreen(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(String.format("%s:%s:%s",
            "Samsung", "Screen", name));
    }

}
