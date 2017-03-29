package com.echo.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class SamsungScreen implements IScreen {

    @Getter
    private String name;

    @Override
    public void doDisplay() {
        System.out.println(String.format("%s:%s:%s",
            "Samsung", "Screen", name));
    }

}
