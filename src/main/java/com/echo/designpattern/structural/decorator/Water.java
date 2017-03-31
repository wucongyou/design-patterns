package com.echo.designpattern.structural.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午9:52
 */
public class Water implements Coffee {

    private Coffee coffee;

    public Water(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void drink() {
        coffee.drink();
        System.out.print("water, ");
    }
}
