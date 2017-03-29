package com.echo.designpattern.singleton;

/**
 * 使用Java的静态内部类实现单例模式，
 * 与jdk版本无关
 */
public class InternalSingleton {

    private InternalSingleton() {
    }

    public static InternalSingleton getInstance() {
        return SingletonClassInstance.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    private Object readResolve() {
        return SingletonClassInstance.instance;
    }

    private static class SingletonClassInstance {
        private static final InternalSingleton instance = new InternalSingleton();
    }

}
