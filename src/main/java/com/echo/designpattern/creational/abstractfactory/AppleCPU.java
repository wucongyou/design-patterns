package com.echo.designpattern.creational.abstractfactory;

public class AppleCPU implements ICPU {

    private String name;

    public AppleCPU(String name) {
        this.name = name;
    }

    @Override
    public void doCalculate() {
        System.out.println(String.format("%s:%s:%s",
            "Apple", "Screen", name));
    }

}
