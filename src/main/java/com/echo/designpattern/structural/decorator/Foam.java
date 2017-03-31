package com.echo.designpattern.structural.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午10:00
 */
public class Foam implements Coffee {

    private Coffee coffee;

    public Foam(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void drink() {
        coffee.drink();
        System.out.print("foam, ");
    }
}
