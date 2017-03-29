package com.echo.designpattern.singleton;


public class DCLSingletonUnsafe {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static DCLSingletonUnsafe instance = null;

    /* 私有构造方法，防止被实例化 */
    private DCLSingletonUnsafe() {
    }

    /* 静态工程方法，创建实例
     * 双重检查锁定
     * */
    public static DCLSingletonUnsafe getInstance() {
        if (instance == null) {
            synchronized (DCLSingletonUnsafe.class) {
                if (instance == null) {
                    instance = new DCLSingletonUnsafe();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    private Object readResolve() {
        return instance;
    }
}
