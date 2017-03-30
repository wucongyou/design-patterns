package com.echo.designpattern.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午10:03
 */
public class SteamedMilk implements Coffee {

    private Coffee coffee;

    public SteamedMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void drink() {
        coffee.drink();
        System.out.print("steamed milk, ");
    }
}
