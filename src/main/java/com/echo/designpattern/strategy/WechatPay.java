package com.echo.designpattern.strategy;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:09
 *
 * Concrete strategy.
 */
public class WechatPay implements Pay {

    @Override
    public void pay(long cent) {
        System.out.print("wechat pay " + cent + "cent");
    }
}
