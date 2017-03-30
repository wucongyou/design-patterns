package com.echo.designpattern.singleton;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午10:23
 *
 * NOTE: This implementation can only work correctly since JDK 1.5.
 */
public class DCLImpl {

    private static volatile DCLImpl instance;

    private DCLImpl() {
    }

    public static DCLImpl instance() {
        if (instance == null) {
            synchronized (DCLImpl.class) {
                if (instance == null) {
                    instance = new DCLImpl();
                }
            }
        }
        return instance;
    }
}
