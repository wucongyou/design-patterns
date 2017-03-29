package com.echo.designpattern.factorymethod;

/**
 * @author echo
 * @since 16-11-3
 */
public class Client {

    public static void main(String[] args) {
        ISender sender = SenderFactoryWithStaticMethod.produceSms();
        sender.send("Hi, there!");
    }

}
