package com.echo.designpattern.structural.proxy;

public class Proxyee implements IProxy {

    @Override
    public void doSomething() {
        System.out.println("This is the origin doSomething of proxyee");
    }

}
