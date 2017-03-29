package com.echo.designpattern.builder;

public interface IBuilder {

    void buildMainBoard();

    void buildCPU();

    void buildGPU();

    void buildMemory();

    void buildDisk();

    void buildPower();

    Computer retrieveResult();

}
