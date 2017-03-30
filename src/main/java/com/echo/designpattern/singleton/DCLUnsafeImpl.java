package com.echo.designpattern.singleton;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午10:
 *
 * NOTE: This implementation cannot work correctly cause JVM memory model, the compiler or jre
 * may reorder the instruction.
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
