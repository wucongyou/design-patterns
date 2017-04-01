package com.echo.designpattern.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        Factory factory = new SamsungFactory();
        factory.getCPU("Exynos-4210").calculate();
        factory.getScreen("AMOLED").display();
        factory = new AppleFactory();
        factory.getCPU("A10").calculate();
        factory.getScreen("IPS").display();
    }

}
