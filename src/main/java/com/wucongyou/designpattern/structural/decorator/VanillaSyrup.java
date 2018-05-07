package com.wucongyou.designpattern.structural.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午10:23
 */
public class VanillaSyrup implements Coffee {

    private Coffee coffee;

    public VanillaSyrup(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void drink() {
        coffee.drink();
        System.out.print("vanilla syrup, ");
    }
}
