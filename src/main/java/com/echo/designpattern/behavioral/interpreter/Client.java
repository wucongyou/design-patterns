package com.echo.designpattern.behavioral.interpreter;

/**
 * @author congyou.wu
 * @since 2017-03-31 下午12:49
 */
public class Client {

    public static void main(String[] args) {
        Var x = new Var("x");
        Var y = new Var("y");
        Var z = new Var("z");
        Context ctx = new Context();
        ctx.put(x).assign("x", 7)
            .put(y).assign("y", 1)
            .put(z).assign("z", 3);
        System.out.println(new Addition(x, y).interpret(ctx)); // x+y
        System.out.println(new Multiplicaiton(z, new Addition(x, y)).interpret(ctx)); // z*(x+y)
    }
}
