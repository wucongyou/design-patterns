package com.echo.designpattern.behavioral.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:51
 */
public interface Iter<T> {

    T next();

    boolean hasNext();
}
