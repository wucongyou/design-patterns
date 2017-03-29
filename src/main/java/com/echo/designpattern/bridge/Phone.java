package com.echo.designpattern.bridge;

import lombok.Setter;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:33
 */
public abstract class Phone {

    @Setter
    protected App app;

    protected void run() {
        app.run();
    }
}
