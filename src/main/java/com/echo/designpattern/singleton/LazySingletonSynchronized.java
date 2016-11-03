package com.echo.designpattern.singleton;


public class LazySingletonSynchronized {

  /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
  private static LazySingletonSynchronized instance = null;

  /* 私有构造方法，防止被实例化 */
  private LazySingletonSynchronized() {
  }

  /* 静态工程方法，创建实例
   * 对getInstance方法加synchronized关键字来实现线程安全，
   * 但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
   * 因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
   *
   *  */
  public static synchronized LazySingletonSynchronized getInstance() {
    if (instance == null) {
      instance = new LazySingletonSynchronized();
    }
    return instance;
  }

  /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
  private Object readResolve() {
    return instance;
  }
  
}
