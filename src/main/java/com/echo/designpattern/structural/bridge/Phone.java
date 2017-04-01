package com.echo.designpattern.structural.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:33
 */
public abstract class Phone {

    protected String name;
    protected App app;

    public void setApp(App app) {
        this.app = app;
    }

    protected void run() {
        System.out.print(name + " is running ");
        app.run();
        System.out.println();
    }
}
