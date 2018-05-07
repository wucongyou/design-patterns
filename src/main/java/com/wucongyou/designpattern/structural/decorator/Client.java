package com.wucongyou.designpattern.structural.decorator;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午9:55
 */
public class Client {

    public static void main(String[] args) {
        Map<String, Coffee> starbucksMenu = ImmutableMap.<String, Coffee>builder()
            .put("americano", new Water(new Espresso()))
            .put("cappuccino", new Foam(new SteamedMilk(new Espresso())))
            .put("latte", new SteamedMilk(new Foam(new Espresso())))
            .put("vanilla latte", new VanillaSyrup(new SteamedMilk(new Foam(new Espresso()))))
            .put("mocha", new Mocha(new SteamedMilk(new WhippedCream(new Espresso()))))
            .build();
        starbucksMenu.forEach((s, coffee) -> {
            System.out.print(s + ": ");
            coffee.drink();
            System.out.println();
        });
    }
}
