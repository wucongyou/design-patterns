package com.echo.designpattern.structural.flyweight;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author congyou.wu
 * @since 2017-03-31 上午10:46
 */
public class Client {

    public static void main(String[] args) {
        int tc = 10;
        ExecutorService exec = Executors.newFixedThreadPool(tc);
        FontFactory factory = new FontFactory();
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> {
                new Character("hello", 17, "red", factory.get(FontFactory.Rendered.HELVETICA)).show();
            });
        }
        exec.shutdown();
    }
}
