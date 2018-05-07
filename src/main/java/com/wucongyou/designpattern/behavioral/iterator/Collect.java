package com.wucongyou.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:50
 */
public interface Collect<T> {

    Iter<T> iter();

    List<T> all();

    @SuppressWarnings("unchecked")
    void add(T e, T... es);

    T get(int i);

    int size();
}
