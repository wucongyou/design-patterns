package com.echo.designpattern.builder;

public interface Builder {

    Builder mainBoard();

    Builder cpu();

    Builder gpu();

    Builder memory();

    Builder disk();

    Builder power();

    Computer build();
}
