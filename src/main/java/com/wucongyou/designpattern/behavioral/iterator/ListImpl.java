package com.wucongyou.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:50
 */
public class ListImpl<T> implements Collect<T> {

    private List<T> items = Lists.newArrayList();

    @Override
    public Iter<T> iter() {
        return new CyclicIter<>(this);
    }

    @Override
    public List<T> all() {
        List<T> list = new ArrayList<>();
        list.addAll(items);
        return list;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public T get(int i) {
        return items.get(i);
    }

    @SafeVarargs
    @Override
    public final void add(T e, T... es) {
        items.add(e);
        items.addAll(Arrays.asList(es));
    }
}
