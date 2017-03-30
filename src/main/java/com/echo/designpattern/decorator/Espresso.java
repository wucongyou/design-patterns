package com.echo.designpattern.decorator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午9:51
 */
public class Espresso implements Coffee {

    @Override
    public void drink() {
        System.out.print("espresso, ");
    }
}
