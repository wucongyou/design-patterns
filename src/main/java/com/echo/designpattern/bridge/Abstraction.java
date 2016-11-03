package com.echo.designpattern.bridge;

public abstract class Abstraction {

  protected Implementor implementor;

  public Abstraction(Implementor implementor) {
    super();
    this.implementor = implementor;
  }

  public Implementor getImplementor() {
    return implementor;
  }

  public void setImplementor(Implementor implementor) {
    this.implementor = implementor;
  }

  public abstract void operation();

}
