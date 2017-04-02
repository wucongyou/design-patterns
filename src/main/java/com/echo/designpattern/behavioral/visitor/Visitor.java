package com.echo.designpattern.behavioral.visitor;

/**
 * @author congyou.wu
 * @since 2017-04-02 下午1:32
 */
public interface Visitor {

    long visit(Book book);

    long visit(Pen pen);
}
