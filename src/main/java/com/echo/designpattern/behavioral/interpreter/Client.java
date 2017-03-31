package com.echo.designpattern.behavioral.interpreter;

/**
 * @author congyou.wu
 * @since 2017-03-31 下午12:49
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.allocate("x", 7).allocate("y", 1).allocate("z", 3);
        Var x = ctx.var("x");
        Var y = ctx.var("y");
        Var z = ctx.var("z");
        System.out.println(new Addition(x, y).interpret(ctx)); // x+y
        System.out.println(new Multiplication(z, new Addition(x, y)).interpret(ctx)); // z*(x+y)
    }
}
