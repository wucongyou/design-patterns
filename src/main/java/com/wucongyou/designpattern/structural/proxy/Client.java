package com.wucongyou.designpattern.structural.proxy;

public class Client {

    public static void main(String[] args) {
        IProxy proxy = new Proxy();
        proxy.doSomething();
        proxy.doSomething();
    }

}
