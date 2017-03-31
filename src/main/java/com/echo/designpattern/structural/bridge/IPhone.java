package com.echo.designpattern.structural.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:41
 */
public class IPhone extends Phone {

    @Override
    protected void run() {
        System.out.print("iPhone is running ");
        app.run();
        System.out.println();
    }
}
