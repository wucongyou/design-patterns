package com.echo.designpattern.behavioral.interpreter;

public class Subtraction implements IExpression {

    @Override
    public int interpret(Context context) {
        return context.getOpe1() - context.getOpe2();
    }

}
