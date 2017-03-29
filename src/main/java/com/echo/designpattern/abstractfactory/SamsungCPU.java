package com.echo.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class SamsungCPU implements ICPU {

    @Getter
    private String name;

    @Override
    public void doCalculate() {
        System.out.println(String.format("%s:%s:%s",
            "Samsung", "CPU", name));
    }

}
