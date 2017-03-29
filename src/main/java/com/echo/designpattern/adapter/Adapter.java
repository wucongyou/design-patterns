package com.echo.designpattern.adapter;

public class Adapter implements IAdapter {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        System.out.println("This is the origin Adapter doSomething");
    }

    @Override
    public void method2Adapted() {
        adaptee.method2();
    }

}
