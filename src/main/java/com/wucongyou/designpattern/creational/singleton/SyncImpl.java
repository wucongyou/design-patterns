package com.wucongyou.designpattern.creational.singleton;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午10:44
 */
public class SyncImpl {

    private static SyncImpl instance;

    private SyncImpl() {
    }

    public static synchronized SyncImpl instance() {
        if (instance == null) {
            instance = new SyncImpl();
        }
        return instance;
    }
}
