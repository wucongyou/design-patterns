package com.echo.designpattern.creational.singleton;

/**
 * NOTE: This implementation cannot work correctly because of JVM memory model, the compiler or jre
 * may reorder the instruction.
 *
 * @author congyou.wu
 * @since 2017-03-31 下午5:27
 */
public class DCLIncorrectImpl {

    private static DCLIncorrectImpl instance;

    private DCLIncorrectImpl() {
    }

    public static DCLIncorrectImpl instance() {
        if (instance == null) {
            synchronized (DCLIncorrectImpl.class) {
                if (instance == null) {
                    instance = new DCLIncorrectImpl();
                }
            }
        }
        return instance;
    }
}

