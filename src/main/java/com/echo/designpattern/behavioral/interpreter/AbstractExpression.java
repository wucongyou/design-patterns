package com.echo.designpattern.behavioral.interpreter;


/**
 * @author congyou.wu
 * @since 2017-03-31 下午12:33
 */
public abstract class AbstractExpression {

    public abstract long interpret(Context c);
}
