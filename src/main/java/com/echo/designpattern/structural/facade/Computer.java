package com.echo.designpattern.structural.facade;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午11:09
 */
public class Computer {

    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private Disk disk = new Disk();

    public Computer run() {
        System.out.println("run");
        return this;
    }

    public Computer startup() {
        System.out.print("startup: ");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("ok");
        return this;
    }

    public void shutdown() {
        System.out.print("shutdown: ");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();
        System.out.println("ok");
    }
}
