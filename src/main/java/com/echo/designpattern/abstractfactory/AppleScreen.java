package com.echo.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class AppleScreen implements IScreen {

    @Getter
    private String name;

    @Override
    public void doDisplay() {
        System.out.println(String.format("%s:%s:%s",
            "Apple", "Screen", name));
    }

}
