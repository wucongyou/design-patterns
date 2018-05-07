package com.wucongyou.designpattern.creational.singleton;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午10:39
 */
public class InnerClassImpl {

    private InnerClassImpl() {
    }

    public static InnerClassImpl instance() {
        return Holder.instance;
    }

    private static class Holder {

        private static InnerClassImpl instance = new InnerClassImpl();
    }
}
