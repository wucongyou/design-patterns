package com.echo.designpattern.creational.builder;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Director(new PCBuilder()).conduct().build();
        System.out.println(computer);
    }
}
