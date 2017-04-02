package com.echo.designpattern.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author congyou.wu
 * @since 2017-04-02 下午1:44
 */
public class ShoppingCart {

    private List<Inventory> invs = Lists.newArrayList();

    public ShoppingCart add(Inventory inv, Inventory... is) {
        invs.add(inv);
        invs.addAll(Arrays.asList(is));
        return this;
    }

    public long calc(Visitor visitor) {
        return invs.stream().mapToLong(inv -> inv.accept(visitor)).sum();
    }
}
