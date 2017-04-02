package com.echo.designpattern.behavioral.visitor;

/**
 * @author congyou.wu
 * @since 2017-04-02 下午1:31
 */
public interface Inventory {

    long accept(Visitor visitor);
}
