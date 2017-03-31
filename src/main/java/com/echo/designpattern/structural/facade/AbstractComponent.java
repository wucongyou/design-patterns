package com.echo.designpattern.structural.facade;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午11:05
 */
public abstract class AbstractComponent implements Component {

    protected String name;

    @Override
    public void startup() {
        System.out.print(name + " -> ");
    }

    @Override
    public void shutdown() {
        System.out.print(name + " -> ");
    }
}
