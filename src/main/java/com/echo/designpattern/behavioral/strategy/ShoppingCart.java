package com.echo.designpattern.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * Context.
 *
 * @author congyou.wu
 * @since 2017-03-30 上午11:14
 */
public class ShoppingCart {

    private List<Inventory> items = Lists.newArrayList();

    public ShoppingCart add(Inventory inv, Inventory... is) {
        items.add(inv);
        items.addAll(Arrays.asList(is));
        return this;
    }

    public void pay(Pay pay) {
        long total = 0L;
        for (Inventory item : items) {
            total += item.getPrice();
        }
        pay.pay(total);
    }
}
