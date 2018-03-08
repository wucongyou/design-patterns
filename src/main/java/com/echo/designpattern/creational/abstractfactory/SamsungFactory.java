package com.echo.designpattern.creational.abstractfactory;

/**
 * ConcreteFactory2.
 */
public class SamsungFactory implements Factory {

    @Override
    public CPU getCPU(String name) {
        return new SamsungCPU(name);
    }

    @Override
    public Screen getScreen(String name) {
        return new SamsungScreen(name);
    }

}
