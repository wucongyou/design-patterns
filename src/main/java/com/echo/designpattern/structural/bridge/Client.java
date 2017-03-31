package com.echo.designpattern.structural.bridge;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:43
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new IPhone();
        phone.setApp(new Memo());
        phone.run();

        phone = new AndroidPhone();
        phone.setApp(new YinYangMaster());
        phone.run();
    }
}
