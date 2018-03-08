package com.echo.designpattern.creational.abstractfactory;

/**
 * ConcreteProductA2.
 */
public class SamsungCPU implements CPU {

    private String name;

    public SamsungCPU(String name) {
        this.name = name;
    }

    @Override
    public void calculate() {
        System.out.println(String.format("%s:%s:%s",
            "Samsung", "CPU", name));
    }

}
