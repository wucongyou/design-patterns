package com.echo.designpattern.behavioral.strategy;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:19
 */
public class Client {

    public static void main(String[] args) {
        new ShoppingCart().add(new Inventory(1, "wahaha", 650L))
            .add(new Inventory(2, "rio cock tail", 1300L))
            .pay(new Alipay());
        System.out.println();
        new ShoppingCart().add(new Inventory(3, "yakult", 1200L))
            .add(new Inventory(2, "rio cock tail", 1300L))
            .pay(new WechatPay());
    }
}
