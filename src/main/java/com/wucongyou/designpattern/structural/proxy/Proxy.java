package com.wucongyou.designpattern.structural.proxy;

public class Proxy implements IProxy {

    IProxy proxyee = new Proxyee();
    private int invokeCount = 0;

    @Override
    public void doSomething() {
        ++invokeCount;
        System.out.println("This is the doAction added by Proxy." + "");
        proxyee.doSomething();
        System.out.println("Totally invoke " + invokeCount + " times.");
    }

}
