package com.wucongyou.designpattern.creational.abstractfactory;

/**
 * AbstractFactory.
 */
public interface Factory {

    CPU getCPU(String name);

    Screen getScreen(String name);
}
