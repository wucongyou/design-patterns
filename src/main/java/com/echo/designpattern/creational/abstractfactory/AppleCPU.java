package com.echo.designpattern.creational.abstractfactory;

public class AppleCPU implements CPU {

    private String name;

    public AppleCPU(String name) {
        this.name = name;
    }

    @Override
    public void calculate() {
        System.out.println(String.format("%s:%s:%s",
            "Apple", "Screen", name));
    }

}
