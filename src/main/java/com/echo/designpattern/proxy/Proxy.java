package com.echo.designpattern.proxy;

public class Proxy implements IProxy {

  /* 和装饰者模式的区别是这里的被代理对象是在编译时期确定 ，而装饰者模式在运行期动态指定 */
  IProxy proxyee = new Proxyee();
  private int invokeCount = 0;

  @Override
  public void doSomething() {
    ++invokeCount;
    System.out.println("This is the doAction added by Proxy." + "");
    proxyee.doSomething();
    System.out.println("Totally invoke " + invokeCount + " times.");
  }

}
