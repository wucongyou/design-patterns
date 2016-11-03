package com.echo.designpattern.singleton;

import java.io.Serializable;

public class DCLVolatileSingleton implements Serializable {

  /**
   * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
   * 使用了volatile关键字，
   * jdk1.5之后支持，
   */
  private volatile static DCLVolatileSingleton instance = null;

  /**
   * 私有构造方法，防止被实例化
   */
  private DCLVolatileSingleton() {
  }

  /**
   * 静态工程方法，创建实例
   * 双重检查锁定
   **/
  public static DCLVolatileSingleton getInstance() {
    if (instance == null) {
      synchronized (DCLVolatileSingleton.class) {
        if (instance == null) {
          instance = new DCLVolatileSingleton();
        }
      }
    }
    return instance;
  }

  /**
   * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
   */
  private Object readResolve() {
    return instance;
  }
  
}
