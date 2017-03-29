package com.echo.designpattern.chainofresponsibility;

public class ConcreteHandler3 extends Handler {

    private String name;
    private int level = RequestLevel.LEVEL_3;

    public ConcreteHandler3(String name) {
        this.name = name;
    }

    @Override
    public int getHandlerLevel() {
        return level;
    }

    @Override
    public String getHandlerDesc() {
        return name;
    }

}
