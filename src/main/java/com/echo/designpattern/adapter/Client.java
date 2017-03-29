package com.echo.designpattern.adapter;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:17
 */
public class Client {

    public static void main(String[] args) {
        ThreeParse threeParse = new ChangeoverPlug(new TwoParseOutlet());
        threeParse.threeParseCharge();
    }

}
