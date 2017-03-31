package com.echo.designpattern.creational.abstractfactory;

public class SamsungCPU implements ICPU {

    private String name;

    public SamsungCPU(String name) {
        this.name = name;
    }

    @Override
    public void doCalculate() {
        System.out.println(String.format("%s:%s:%s",
            "Samsung", "CPU", name));
    }

}
