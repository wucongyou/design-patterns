package com.echo.designpattern.flyweight;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author congyou.wu
 * @since 2017-03-31 上午10:46
 */
public class Client {

    public static void main(String[] args) {
        FontFactory factory = new FontFactory();
        int tc = 10;
        ExecutorService exec = Executors.newFixedThreadPool(tc);
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> {
                AbstractFont font = factory.get(FontFactory.Rendered.HELVETICA);
                new Character("hello", 17, "red", font).show();
            });
        }
    }
}
