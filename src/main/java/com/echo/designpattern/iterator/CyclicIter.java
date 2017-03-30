package com.echo.designpattern.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:51
 */
public class CyclicIter<T> implements Iter<T> {

    private int position;
    private Collect<T> collect;

    public CyclicIter(Collect<T> collect) {
        position = -1;
        this.collect = collect;
    }

    @Override
    public T next() {
        if (position < collect.size() - 1) {
            ++position;
            return collect.get(position);
        } else {
            position = -1;
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return position < collect.size() - 1;
    }
}
