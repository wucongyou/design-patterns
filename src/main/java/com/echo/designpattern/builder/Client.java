package com.echo.designpattern.builder;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Director(new PCBuilder()).conduct().build();
        System.out.println(computer);
    }
}
