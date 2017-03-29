package com.echo.designpattern.chainofresponsibility;

public class ConcreteRequest1 extends Request {
    private int level = RequestLevel.LEVEL_1;

    public ConcreteRequest1(String content) {
        super(content);
    }

    @Override
    protected int getRequestLevel() {
        return level;
    }

}
