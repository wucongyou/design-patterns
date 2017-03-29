package com.echo.designpattern.decorator;

public class Decorator implements IDecoratee {
    private IDecoratee source;

    public Decorator(IDecoratee source) {
        this.source = source;
    }

    @Override
    public void doSomething() {
        System.out.println("Decorator : before running decoratee's doSomething");
        source.doSomething();
        System.out.println("Decorator : after running decoratee's doSomething");
    }
}
