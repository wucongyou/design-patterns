package com.echo.designpattern.structural.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:33
 */
public abstract class App {

    protected String name;

    public void run() {
        System.out.print(name);
    }
}
