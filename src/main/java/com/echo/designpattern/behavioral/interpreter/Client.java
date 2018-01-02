package com.echo.designpattern.behavioral.interpreter;

/**
 * @author congyou.wu
 * @since 2017-03-31 下午12:49
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();

        int xV = 7, yV = 1, zV = 3;

        ctx.allocate("x", xV)
            .allocate("y", yV)
            .allocate("z", zV);

        Var x = ctx.var("x");
        Var y = ctx.var("y");
        Var z = ctx.var("z");

        // x + y
        long res = new Addition(x, y).interpret(ctx);
        if (res != (xV + yV)) {
            throw new RuntimeException("res is incorrect");
        }

        // (x + y) * z
        res = new Multiplication(new Addition(x, y), z).interpret(ctx);
        if (res != (xV + yV) * zV) {
            throw new RuntimeException("res is incorrect");
        }

        // assign 2 to z
        ctx.assign("z", 2);
        if (z.interpret(ctx) != 2) {
            throw new RuntimeException("failed to assign var");
        }
    }
}
