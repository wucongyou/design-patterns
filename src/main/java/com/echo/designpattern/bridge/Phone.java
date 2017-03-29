package com.echo.designpattern.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:33
 */
public abstract class Phone {

    protected App app;

    public void setApp(App app) {
        this.app = app;
    }

    protected void run() {
        app.run();
    }
}
