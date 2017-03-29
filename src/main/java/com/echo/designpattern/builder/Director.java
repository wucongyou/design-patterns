package com.echo.designpattern.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder conduct() {
        return builder.mainBoard().cpu().gpu().memory().disk().power();
    }

}
