package com.echo.designpattern.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午10:26
 */
public class WhippedCream implements Coffee {

    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void drink() {
        coffee.drink();
        System.out.print("whipped cream, ");
    }
}
