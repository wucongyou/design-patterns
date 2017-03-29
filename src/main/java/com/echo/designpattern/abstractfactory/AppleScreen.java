package com.echo.designpattern.abstractfactory;

public class AppleScreen implements IScreen {

    private String name;

    public AppleScreen(String name) {
        this.name = name;
    }

    @Override
    public void doDisplay() {
        System.out.println(String.format("%s:%s:%s",
            "Apple", "Screen", name));
    }

}
