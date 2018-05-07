package com.wucongyou.designpattern.behavioral.strategy;

/**
 * Abstract Strategy.
 *
 * @author congyou.wu
 * @since 2017-03-30 上午11:06
 */
@FunctionalInterface
public interface Pay {

    void pay(long cent);
}
