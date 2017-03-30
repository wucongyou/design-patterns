package com.echo.designpattern.strategy;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:19
 */
public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Inventory(1, "milk", 990L))
            .add(new Inventory(2, "fruit", 2000L))
            .pay(new Alipay());
    }
}
