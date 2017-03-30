package com.echo.designpattern.strategy;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:14
 *
 * Context.
 */
public class ShoppingCart {

    private List<Inventory> items = Lists.newArrayList();

    public ShoppingCart add(Inventory inv, Inventory... is) {
        items.add(inv);
        for (Inventory i : is) {
            items.add(i);
        }
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
