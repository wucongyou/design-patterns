package com.echo.designpattern.adapter;

/**
 * @author congyou.wu
 * @since 2017-03-29 下午8:18
 */
public class ChangeoverPlug implements ThreeParse {

    private TwoParse twoParse;

    public ChangeoverPlug(TwoParse twoParse) {
        this.twoParse = twoParse;
    }

    @Override
    public void threeParseCharge() {
        twoParse.twoParseCharge();
        System.out.println("now I can also charge for three-parse plug devices with the help of changeover plug");
    }
}

