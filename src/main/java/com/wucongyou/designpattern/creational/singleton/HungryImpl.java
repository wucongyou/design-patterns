package com.wucongyou.designpattern.creational.singleton;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午10:37
 */
public class HungryImpl {

    private static final HungryImpl instance = new HungryImpl();

    private HungryImpl() {
    }

    public static HungryImpl instance() {
        return instance;
    }
}
