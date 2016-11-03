package com.echo.designpattern.flyweight;

/**
 * @author echo
 * @since 16-11-3
 */
public interface IFlyweightFactory {

  AbstractFlyweight getInstance(String key);

  int size();

  int visitCount(String key);

}
