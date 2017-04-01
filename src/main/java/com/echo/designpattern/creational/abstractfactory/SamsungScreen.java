package com.echo.designpattern.creational.abstractfactory;

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
