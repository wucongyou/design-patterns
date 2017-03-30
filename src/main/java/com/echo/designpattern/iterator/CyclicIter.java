package com.echo.designpattern.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:51
 */
public class CyclicIter<T> implements com.echo.designpattern.iterator.Iter<T> {

    private int idx;
    private com.echo.designpattern.iterator.Collect<T> collect;

    public CyclicIter(Collect<T> collect) {
        idx = -1;
        this.collect = collect;
    }

    @Override
    public T next() {
        if (idx < collect.size() - 1) {
            ++idx;
            return collect.get(idx);
        } else {
            idx = -1;
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return idx < collect.size() - 1;
    }
}
