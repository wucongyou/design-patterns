package com.echo.designpattern.behavioral.interpreter;

/**
 * @author congyou.wu
 * @since 2017-03-31 下午12:36
 */
public class Var extends AbstractExpression {

    private String name;
    private int value;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public long interpret(Context c) {
        return c.var(name).value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
