package com.echo.designpattern.proxy;

public class Client {

    public static void main(String[] args) {
        IProxy proxy = new Proxy();
        proxy.doSomething();
        proxy.doSomething();
    }

}
