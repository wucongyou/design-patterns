package com.echo.designpattern.decorator;

public class Decoratee implements IDecoratee {

    @Override
    public void doSomething() {
        System.out.println("This is decoratee's doSomething running");
    }

}
