package com.echo.designpattern.structural.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:43
 */
public class AndroidPhone extends Phone {

    @Override
    protected void run() {
        System.out.print("Android phone is running ");
        app.run();
        System.out.println();
    }
}
