package com.echo.designpattern.structural.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午10:27
 */
public class Mocha implements Coffee {

    private Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void drink() {
        coffee.drink();
        System.out.print("mocha, ");
    }
}
