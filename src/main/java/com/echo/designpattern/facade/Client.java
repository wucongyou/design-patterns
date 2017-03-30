package com.echo.designpattern.facade;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午11:09
 */
public class Client {

    public static void main(String[] args) {
        new Computer().startup().run().shutdown();
    }
}
