package com.echo.designpattern.behavioral.interpreter;

/**
 * @author congyou.wu
 * @since 2017-03-31 下午1:07
 */
public class Multiplicaiton extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;

    public Multiplicaiton(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public long interpret(Context c) {
        return left.interpret(c) * right.interpret(c);
    }
}
