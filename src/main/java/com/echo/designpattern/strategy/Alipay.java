package com.echo.designpattern.strategy;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:07
 *
 * Concrete strategy.
 */
public class Alipay implements Pay {

    @Override
    public void pay(long cent) {
        System.out.print("alipay " + cent + " cent");
    }
}
