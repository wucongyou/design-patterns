package com.echo.designpattern.structural.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:43
 */
public class Client {

    public static void main(String[] args) {
        new IPhone().launch(new Memo()).run();
        new IPhone().launch(new YinYangMaster()).run();
        new GooglePixelPhone().launch(new Memo()).run();
        new GooglePixelPhone().launch(new YinYangMaster()).run();
    }
}
