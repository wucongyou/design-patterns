package com.echo.designpattern.creational.singleton;

/**
 * NOTE: This implementation cannot work correctly cause JVM memory model, the compiler or jre
 *  may reorder the instruction.
 * @author congyou.wu
 * @since 2017-03-30 上午10:
 */
public class DCLUnsafeImpl {

    private static DCLUnsafeImpl instance;

    private DCLUnsafeImpl() {
    }

    public static DCLUnsafeImpl instance() {
        if (instance == null) {
            synchronized (DCLUnsafeImpl.class) {
                if (instance == null) {
                    instance = new DCLUnsafeImpl();
                }
            }
        }
        return instance;
    }
}
