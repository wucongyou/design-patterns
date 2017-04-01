package com.echo.designpattern.creational.abstractfactory;

public class AppleFactory implements Factory {

    @Override
    public CPU getCPU(String name) {
        return new AppleCPU(name);
    }

    @Override
    public Screen getScreen(String name) {
        return new AppleScreen(name);
    }

}
