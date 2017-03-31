package com.echo.designpattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午10:21
 */
public class Client {

    public static void main(String[] args) {
        int tc = 10;
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> System.out.println(DCLIncorrectImpl.instance()));
        }
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> System.out.println(DCLImpl.instance()));
        }
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> System.out.println(EnumImpl.INSTANCE));
        }
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> System.out.println(HungryImpl.instance()));
        }
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> System.out.println(InnerClassImpl.instance()));
        }
        for (int i = 0; i < tc; i++) {
            exec.execute(() -> System.out.println(SyncImpl.instance()));
        }
        exec.shutdown();
    }
}
