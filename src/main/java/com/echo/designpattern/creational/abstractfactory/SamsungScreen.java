package com.echo.designpattern.creational.abstractfactory;

public class SamsungScreen implements IScreen {

    private String name;

    public SamsungScreen(String name) {
        this.name = name;
    }

    @Override
    public void doDisplay() {
        System.out.println(String.format("%s:%s:%s",
            "Samsung", "Screen", name));
    }

}
